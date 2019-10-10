package com.company;

//     Написать многопоточное приложение передачи эстафетной палочки бегунами друг другу. Всего должно быть 5 бегунов.
//             Каждый бегун является самостоятельным потоком, созданным на основе вашего класса Runner. Всего должен быть только 1 класс поток не более.
//             Потоки запускаются по цепной реакции. То есть с Main класса запустили поток под названием “Runner 1”, в раннер 1 запускается поток “Runner 2” и т.д.
//             Вывод программы в консоле должен выглядеть именно так (примечание симулируете бег задержкой потока в 5 секунд):
//             Runner 1 берет палочку
//             Runner 1 бежит к Runner 2
//             Runner 2 берет палочку
//             Runner 2 бежит к Runner 3
//             Runner 3 берет палочку
//             Runner 3 бежит к Runner 4
//             Runner 4 берет палочку
//             Runner 4 бежит к Runner 5
//             Runner 5 берет палочку
//             Runner 5 бежит к финишу
//             Runner 5 бежит к Runner 4
//             Runner 4 берет палочку
//             Runner 4 бежит к Runner 3
//             Runner 3 берет палочку
//             Runner 3 бежит к Runner 2
//             Runner 2 берет палочку
//             Runner 2 бежит к Runner 1
//             Runner 1 берет палочку


public class Relayrace extends Thread{
    Thread runnable1 = new Thread();
    Thread runnable2 = new Thread();
    Thread runnable3 = new Thread();
    Thread runnable4 = new Thread();
    Thread runnable5 = new Thread();

    @Override
    public void run() {
        try {
            runnable1.setName("Runner 1 ");
            runnable2.setName("Runner 2 ");
            runnable3.setName("Runner 3 ");
            runnable4.setName("Runner 4 ");
            runnable5.setName("Runner 5 ");


            System.out.println(runnable1.getName() + "берет палочку");
            System.out.println(runnable1.getName() + "бежит к " + runnable2.getName());
            runnable1.start();
            runnable1.sleep(5000);




            System.out.println(runnable2.getName() + "берет палочку");
            System.out.println(runnable2.getName() + "бежит к " + runnable3.getName());
            runnable2.join();
            runnable2.start();
            runnable2.sleep(5000);



            System.out.println(runnable3.getName() + "берет палочку");
            System.out.println(runnable3.getName() + "бежит к " + runnable4.getName());
            runnable3.join();
            runnable3.start();
            runnable3.sleep(5000);



            System.out.println(runnable4.getName() + "берет палочку");
            System.out.println(runnable4.getName() + "бежит к " + runnable5.getName());
            runnable4.join();
            runnable4.start();
            runnable4.sleep(5000);


            System.out.println(runnable5.getName() + "берет палочку");
            System.out.println(runnable5.getName() + "бежит к финишу" );
            runnable5.join();
            runnable5.start();
            runnable5.sleep(5000);


            runnable5.join();
            runnable4.run();
            System.out.println(runnable5.getName() + "бежит к " + runnable4.getName() );
            runnable4.sleep(5000);

            System.out.println(runnable3.getName() + "берет палочку");
            System.out.println(runnable3.getName() + "бежит к " + runnable2.getName());
            runnable4.join();
            runnable3.run();
            runnable3.sleep(5000);

            System.out.println(runnable2.getName() + "берет палочку");
            System.out.println(runnable2.getName() + "бежит к " + runnable1.getName());
            runnable2.join();
            runnable2.run();
            runnable2.sleep(5000);

            System.out.println(runnable1.getName() + "берет палочку");
            runnable1.join();
            runnable1.run();
            runnable1.sleep(5000);




        }catch (Exception e){

        }

    }
}

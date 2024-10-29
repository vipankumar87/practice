package org.rudra;

public class ConcurrencyControll {

    public static int counter1, counter2 = 0;
    public void start() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter1++;
                }
            }
        });
        thread1.start();
//        thread1.join();
//        System.out.println("Counter 1: " + counter1);

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter2++;
                }
            }
        });
        thread2.start();
//        thread2.join();
//        System.out.println("Counter 2: " + counter2);

        Thread thread3 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Counter 1: " + counter1);
                System.out.println("Counter 2: " + counter2);
            }
        });
        thread3.start();
//        thread2.join();
        System.out.println("Counter 1: " + counter1);
    }
}

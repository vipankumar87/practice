package org.rudra;

public class deadlock {
    static final String Lock1 = "Lock1";
    static final String Lock2 = "Lock2";

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Lock1){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1, lock1");
                    synchronized (Lock2){
                        System.out.println("Thread2, lock2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Lock2){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread2, lock2");
                    synchronized (Lock1){
                        System.out.println("Thread1, lock1");
                    }
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t1.join();
        System.out.println("Finished");
    }
}

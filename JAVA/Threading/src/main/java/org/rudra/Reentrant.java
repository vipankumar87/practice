package org.rudra;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {

    public static int counter = 0;
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                for (int i = 0; i < 100000; i++) {
                    Reentrant.counter++;
                }
                lock.unlock();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                for (int i = 0; i < 100000; i++) {
                    Reentrant.counter++;
                }
                lock.unlock();
            }
        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println("Counter: " + Reentrant.counter);
    }
}

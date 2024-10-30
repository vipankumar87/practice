package org.rudra;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class deadlockResolved {

    static final Lock Lock1 = new ReentrantLock();
    static final Lock Lock2 = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running " + Thread.currentThread().getName());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                while(true){
                    try {
                        flagLock1 = Lock1.tryLock(10, TimeUnit.MILLISECONDS);
                        flagLock2 = Lock2.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        if(flagLock1){
                            System.out.println("Thread1, Lock1");
                            Lock1.unlock();
                        }
                        if(flagLock2){
                            System.out.println("Thread1, Lock2");
                            Lock2.unlock();
                        }

                        if(flagLock1 && flagLock2){
                            break;
                        }
                    }
                }
                /*
                not working
                 */
                /*
                Lock1.lock();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1, lock1");
                    Lock2.lock();
                    System.out.println("Thread2, lock2");
                    Lock2.unlock();
                Lock1.unlock();

                 */
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                while(true){
                    try {
                        flagLock2 = Lock2.tryLock(10, TimeUnit.MILLISECONDS);
                        flagLock1 = Lock1.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        if(flagLock2){
                            System.out.println("Thread1, Lock2");
                            Lock2.unlock();
                        }
                        if(flagLock1){
                            System.out.println("Thread1, Lock1");
                            Lock1.unlock();
                        }

                        if(flagLock1 && flagLock2){
                            break;
                        }
                    }
                }

                /*
                Lock2.lock();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread2, lock2");
                    Lock1.lock();
                    System.out.println("Thread1, lock1");
                    Lock1.unlock();
                Lock2.unlock();

                 */
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t1.join();
        System.out.println("Finished");
    }
}


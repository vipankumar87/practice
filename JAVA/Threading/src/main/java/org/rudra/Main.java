package org.rudra;

import java.util.concurrent.ArrayBlockingQueue;

// Producer class adds elements to the queue
class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Simulate delay in producing items
                Thread.sleep(1000);
                queue.put(Main.counter); // Adds an item to the queue
                System.out.println("Value added in the queue: " + Main.counter);
                Main.counter++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class removes elements from the queue
class Consumer2 implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer2(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Simulate delay in consuming items
                Thread.sleep(500);
                int value = queue.take(); // Removes an item from the queue
                System.out.println("Value removed from the queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
//        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
//
//        // Creating producer and consumer threads
//        Thread producerThread = new Thread(new Producer(queue));
//        Thread consumerThread = new Thread(new Consumer(queue));
//
//        // Start both threads
//        producerThread.start();
//        consumerThread.start();
        Reentrant.main(args);
    }
}
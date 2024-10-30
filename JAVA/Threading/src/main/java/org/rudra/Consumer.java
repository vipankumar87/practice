package org.rudra;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
            queue.take();
            System.out.println("Value removed from the queue");
//            Main.counter--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

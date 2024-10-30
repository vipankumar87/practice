package org.rudra;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingThreading implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public BlockingThreading(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        while (true){
            try{
                Thread.sleep(1000);
                queue.put(Main.counter);
                System.out.println("Value added in queye : " + Main.counter);
                Main.counter++;

            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

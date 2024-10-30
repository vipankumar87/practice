package org.rudra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPools {

    public void start(){
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing thread");
            }
        });
        executorService.execute(thread);
        executorService.shutdown();
    }
}

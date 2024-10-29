package org.rudra;

import java.net.SocketTimeoutException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int balance = 0;
     synchronized public void withdraw(int amount) {
         if (balance <= 0) {
             System.out.println("Waiting for amount to be updated after withdrawal of $" + amount);
             try {
                 wait();
             } catch (InterruptedException e) {
                 System.out.println("Withdrawal interrupted");
                 return;
             }
         }

         if ((balance - amount) < 0) {
             System.out.println("Balance is too low for withdrawal $"+amount);
             System.out.println("Withdrawal Incomplete");
             return;
         }

         System.out.println("We are withdrawal of $"+ amount);
         balance = balance - amount;
         System.out.println("The balance is now $" + balance);
     }
     public boolean deposit(int amount) {
         synchronized (this) {
             if(amount > 0) {
                 System.out.println("we are trying to deposit $" + amount);
                 balance = balance + amount;
                 System.out.println("We are now $" + amount);
                 notify();
                 return true;
             } else {
                 System.out.println("Invalid amount to deposit $" + amount);
                 return false;
             }
         }
     }
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                main.withdraw(10);
                main.withdraw(100);
            }
        });
        thread.setName("Banking");
        thread.start();

        Thread thread2 = new Thread(new Runnable() {

            /**
             * When an object implementing interface {@code Runnable} is used
             * to create a thread, starting the thread causes the object's
             * {@code run} method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method {@code run} is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            @Override
            public void run() {
                if(main.deposit(-1)) {
                    main.withdraw(1000);
                } else {
                    thread.interrupt();
                }
            }
        });
        thread2.setName("Banking");
        thread2.start();
    }
}
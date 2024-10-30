package org.rudra.lamda;

interface lamb{
    public void add();
}
public class Lm1 {
    public static void start(){
        lamb lm = (()->{
            System.out.println("State 1");
            System.out.println("State 1");
        });
        lm.add();
    }
}

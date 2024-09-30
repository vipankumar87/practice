package org.rudra;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("closed", "on", "seated", 12);
//        car.setSpeed(1).setDoors("closed");
//        car.setSpeed(500);
//        car.setEngine("on");
//        car.setDriver("seated");
        System.out.println(car.run());
//        System.out.println(car.getDoors());
//        System.out.println(car.getSpeed());
        System.out.println("Hello World");
    }
}
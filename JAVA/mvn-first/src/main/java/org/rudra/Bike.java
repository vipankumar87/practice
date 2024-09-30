package org.rudra;

public class Bike extends Vehicle {
    private String handle;

    public Bike(String engine, int wheels, int seats, int fuelTanks, String lights, String handle) {
        super(engine, wheels, seats, fuelTanks, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String run(){
        return "Bike is running";
    }
    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' + super.toString() +
                '}';
    }
}

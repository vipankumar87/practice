package org.rudra;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTanks;
    private String lights;

    public Vehicle(String engine, int wheels, int seats, int fuelTanks, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTanks = fuelTanks;
        this.lights = lights;
    }

    public Vehicle(){
        engine = "petrol";
        wheels = 2;
        seats =2;
        fuelTanks = 12;
        lights = "RGB";
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFuelTanks() {
        return fuelTanks;
    }

    public void setFuelTanks(int fuelTanks) {
        this.fuelTanks = fuelTanks;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public String run(){
        return "runing vehicle";
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTanks=" + fuelTanks +
                ", lights='" + lights + '\'' +
                '}';
    }
}

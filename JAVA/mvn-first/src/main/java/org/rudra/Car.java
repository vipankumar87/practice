package org.rudra;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public float test;
    public boolean status;

    public Car(){
        doors = "closed";
        engine = "on";
        driver = "seated";
        speed = 1;
    }

    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public String getDoors() {
        return doors;
    }

    public Car setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    public String run(){
        if(doors.equals("closed") && engine.equals("on")
                && driver.equals("seated") && speed > 0){
            return "running";
        } else {
            return "not running";
        }
    }
}

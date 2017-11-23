package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    private double mileage;
    private double fuelLevel;
    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;


    }

    public AutoVehicle() {

        this(new Engine());
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuellevel() {
        return fuelLevel;
    }

    public void setFuellevel(double fuellevel) {
        this.fuelLevel = fuellevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

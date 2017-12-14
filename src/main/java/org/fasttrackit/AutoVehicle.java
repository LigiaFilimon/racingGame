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

    @Override
    public double accelerate(double speed) {
        System.out.println("Accelerate implementation from AutoVehicle");
        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);

        double travelDistance = finalSpeed / 60;
        double spentFuel = travelDistance * mileage / 100;
        fuelLevel -= spentFuel;
                // fuelLevel = fuelLevel - spentFuel  -varianta alternativa//

        return travelDistance;

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

package org.fasttrackit;

public class Vehicle {


    private String name;
    private String color;

    private double mileage;
    private double fuelLevel;
    private double currentSpeed;
    private double travelDistance;

    public double getTravelDistance() {
        return travelDistance;
    }









    public void accelerate(double speed) {
        System.out.println("Accelerate implementation from AutoVehicle");
        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);

        double travelDistance = finalSpeed / 60;
        double spentFuel = travelDistance * mileage / 100;
        fuelLevel -= spentFuel;
        // fuelLevel = fuelLevel - spentFuel  -varianta alternativa//

        travelDistance= travelDistance + currentSpeed / 60;
//travelDistance += currentSpeed / 60; modul mai usor prescurtat//
    }




    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

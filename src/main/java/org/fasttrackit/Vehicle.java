package org.fasttrackit;

public class Vehicle {


    private String name;
    private String color;
    private double currentSpeed;




    public double accelerate(double speed) {
        System.out.println("Accelerate implementation from Vehicle");

        currentSpeed = currentSpeed + speed;

        // sau currentSpeed += speed prescurtat//
        return currentSpeed / 60;


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

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

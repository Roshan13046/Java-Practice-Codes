package com.roshan;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity=0;
        this.currentDirection=0;
    }

    public void sterr(int direction){
        this.currentDirection=direction;
        System.out.println("Vehicle sterr(): sterring at "+
        currentDirection+" degrees ");
    }
    public void move(int velocity,int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("vehicle.move() at "+currentVelocity +
                "is direction "+ currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity=0;
    }
}

package com.roshan;

public class Car extends Vehicle {
    private int wheels,doors,gears;
    private boolean isManual;
    private int curentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.curentGear = 1;
    }

    public void changedGear(int curentGear) {
        this.curentGear = curentGear;
        System.out.println("Car.changedGear():changed to :"+
                this.curentGear + " gear ");
    }

    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("Car.changevelocity(): velocity "+
                speed + " direction "+direction);
    }
}



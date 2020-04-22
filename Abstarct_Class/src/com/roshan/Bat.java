package com.roshan;

public class Bat extends Animal implements CanFly{
    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println( getName() +" Eat's Snakes and Insects .");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breathes and Passes Ultrasonic Waves .");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" Can Fly but Can't See.");
    }
}

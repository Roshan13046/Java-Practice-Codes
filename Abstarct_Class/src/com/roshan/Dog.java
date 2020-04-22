package com.roshan;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating and chewing food .");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathes in and out .");
    }
}

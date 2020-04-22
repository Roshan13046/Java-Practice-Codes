package com.roshan;

public class Dragon extends Animal implements CanFly  {
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" Eats Small Animmal's and Birds");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" Breaths thruogh Lungs");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" Dragons Can Fly but they are not Birds");
    }
}

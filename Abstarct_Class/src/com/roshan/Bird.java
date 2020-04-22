package com.roshan;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " pecking the Seeds and Nuts .");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " can breathe in and out .");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flappinf it's Wing's");
    }
}

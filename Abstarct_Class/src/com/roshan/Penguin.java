package com.roshan;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " I am unable to fly , can Swim Nicely .");
    }
}

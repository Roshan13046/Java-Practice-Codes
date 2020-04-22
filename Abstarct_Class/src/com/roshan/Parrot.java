package com.roshan;

public class Parrot extends Bird implements HatchEggs {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void layEggs() {
        System.out.println(getName()+" birds Lay Eggs for Reproduction.");
    }
}

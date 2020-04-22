package com.roshan;

public class Furniture {
    private int tables;
    private int chairs;
    private int stools;
    private int beds;
    private int doors;

    public Furniture(int tables, int chairs, int stools, int beds, int doors) {
        this.tables = tables;
        this.chairs = chairs;
        this.stools = stools;
        this.beds = beds;
        this.doors = doors;
    }

    public void totalFurnitures(){
        System.out.println("The Furniture's are "+tables+" tables, "+chairs+" chairs, "+stools+" stools, "+beds+" beds, "+doors+" doors " );
    }

    public int getTables() {
        return tables;
    }

    public int getChairs() {
        return chairs;
    }

    public int getStools() {
        return stools;
    }

    public int getBeds() {
        return beds;
    }

    public int getDoors() {
        return doors;
    }
}

package com.roshan;

public class Electronics {
    
    private int fans;
    private int coolers;
    private int airConditioners;
    private int laptops;
    private int television;

    public Electronics(int fans, int coolers, int airConditioners, int laptops, int television) {
        this.fans = fans;
        this.coolers = coolers;
        this.airConditioners = airConditioners;
        this.laptops = laptops;
        this.television = television;
    }

    public void  totalElectronicGadgets(){
        System.out.println("The Electronic gadgets are :"+fans +" fans, "+coolers+" coolers ,"+airConditioners+" AC , "+laptops+" Laptops, "+television + " TV ");
    }

    public int getFans() {
        return fans;
    }

    public int getCollers() {
        return coolers;
    }

    public int getAirConditioners() {
        return airConditioners;
    }

    public int getComputers() {
        return laptops;
    }

    public int getTelevision() {
        return television;
    }
}

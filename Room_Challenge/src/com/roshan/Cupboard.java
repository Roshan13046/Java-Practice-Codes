package com.roshan;

import java.awt.*;

public class Cupboard {
    private Dimension dimension;//composition Eg cupBoard has a Dimension
    private String Manufacturer;
    private String lockerType;
    private int Volume;

    public Cupboard(Dimension dimension, String manufacturer, String lockerType, int volume) {
        this.dimension = dimension;
        Manufacturer = manufacturer;
        this.lockerType = lockerType;
        Volume = volume;
    }

    public void featuresOfCupboard(){
        System.out.println("Cupboard has "+Volume +" metric cube , "+Manufacturer+" Brand ,"+lockerType+" lockertype ");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getLockerType() {
        return lockerType;
    }

    public int getVolume() {
        return Volume;
    }
}

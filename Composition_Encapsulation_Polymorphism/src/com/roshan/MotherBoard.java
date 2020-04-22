package com.roshan;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int noOfRamSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int noOfRamSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.noOfRamSlots = noOfRamSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName+" is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNoOfRamSlots() {
        return noOfRamSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

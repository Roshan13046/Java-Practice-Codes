package com.roshan;

public class Room {

    private Cupboard cupboard;
    private Furniture furniture;
    private Electronics electronics;
    private Members members;

    public Room(Cupboard cupboard, Furniture furniture, Electronics electronics, Members members) {
        this.cupboard = cupboard;
        this.furniture = furniture;
        this.electronics = electronics;
        this.members = members;
    }

    public void featuresOFRoom(){
        System.out.println("The Room is Hall having a cupboard ,some furnitures,Electronics,and some family members ");
        members.noOfMembers();
        furniture.totalFurnitures();
        cupboard.featuresOfCupboard();
        electronics.totalElectronicGadgets();
    }



    /*
    private Cupboard getCupboard() {
        return cupboard;
    }

    private Furniture getFurniture() {
        return furniture;
    }

    private Electronics getElectronics() {
        return electronics;
    }

    private Members getMembers() {
        return members;
    }


     */
}

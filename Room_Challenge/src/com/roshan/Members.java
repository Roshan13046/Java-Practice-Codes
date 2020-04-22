package com.roshan;

public class Members {

    private int boys;
    private int girls;
    private int grandFather;
    private int grandMother;

    public Members(int boys, int girls, int grandFather, int grandMother) {
        this.boys = boys;
        this.girls = girls;
        this.grandFather = grandFather;
        this.grandMother = grandMother;
    }

    public void noOfMembers(){
        System.out.println("The Total Family Members : "+(boys+girls+grandFather+grandMother));
    }

    public int getBoys() {
        return boys;
    }

    public int getGirls() {
        return girls;
    }

    public int getGrandFather() {
        return grandFather;
    }

    public int getGrandmother() {
        return grandMother;
    }
}

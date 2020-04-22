package com.roshan;
//Composition : Its a modelling of componnents with has a relationship


public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    public void drawLogo(){
        //fancy Graphics
        monitor.drawPixelAt(20,35,"Brown");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}

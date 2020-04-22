package com.roshan;

public class Main {
//COMPOSITION : It's the modelling of various components of object's having has a relationship..........................
    public static void main(String[] args) {
        //We have to build a Computer so computer has components too be modelled using composition and "has a relationship"
        //object PC will contain Case ,Monitor ,MotherBoard

        Dimension dimension = new Dimension(18,25,10);

        Case theCase = new Case("123AMD","ASUS","240V",dimension);
        //Note:new Resolution() class
        Monitor monitor = new Monitor("SAM12398AX","SAMSUNG",180,new Resolution(180,120));

        MotherBoard motherBoard = new MotherBoard("AM5678","Intell",4,2,"Default");

        PC pc = new PC(theCase,monitor,motherBoard);
        //how to access Monitor from pc object
        /*
        pc.getMonitor().drawPixelAt(15,30,"RED");
        pc.getMotherBoard().loadProgram(" Hello,World ! ");

        System.out.println("The Dimension of Case : "+ pc.getTheCase().getDimension().getHeight()+" , "+pc.getTheCase().getDimension().getLength()+" , "+pc.getTheCase().getDimension().getWidth());
        System.out.println("The Case Manufacturer is :"+pc.getTheCase().getManufacturer());

         */
        //We are Having the Monitor,MotherBoard and case are private fields of PC object
        //so In OOP we cannot use private members of the object outside the class
        //so using this another type of accessing the members features using powerUp function

        pc.powerUp();//pc is a master object

    }
}

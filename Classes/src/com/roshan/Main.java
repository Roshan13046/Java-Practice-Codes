package com.roshan;

public class Main {

    public static void main(String[] args) {
        Bus volvo = new Bus();
        //volvo.setModel("carrier");
        //if commented then it gives output model as null
        volvo.setModel("carrier");
        volvo.setModel("12345678");

        volvo.setDoors(8);
        volvo.setEngine("Deisel");
        volvo.setWheel(18);

        System.out.println("Model is : "+volvo.getModel());
        System.out.println("Engine type : "+volvo.getEngine());
        System.out.println("Wheels : "+volvo.getWheel());
        System.out.println("Doors  : "+volvo.getDoors());
    }
}

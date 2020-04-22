package com.roshan;

class Car {
    private String carName;
    private int cylinders,wheels,engine;

    public Car(String carName, int cylinders) {
        this.carName = carName;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = 1;
    }

    public String startEngine(){
        return "Base class  StartEngine";
    }
    public String acclerate(){
        return "Base Class accelerate";
    }
    public String brake(){
        return "Base class Brake";
    }

    public String getCarName() {
        return carName;
    }

    public int getCylinders() {
        return cylinders;
    }
}
//Class 1
class Polo extends Car{
    public Polo() {
        super("polo", 3);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" startEngine ";   //NOTE:getClass().getSimpleName() it gives the current class name and note to add " + "
    }

    @Override
    public String acclerate() {
        return getClass().getSimpleName()+" accelerate ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" brake ";
    }
}
//Class 2
class Indica extends Car{
    public Indica() {
        super("Indica",6);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName()+" startEngine";
    }

    @Override
    public String acclerate() {
        return getClass().getSimpleName()+" accelerate ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" brake";
    }
}

//Class 3
class Innova extends Car{
    public Innova() {
        super("Innova",6);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName()+" startEngine";
    }

    @Override
    public String acclerate() {
        return getClass().getSimpleName()+" accelerate ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" brake";
    }
}

//class 4

//** rightClick +REFACTOR +select  in which class to move
 class SwiftDzire extends Car{
    public SwiftDzire() {
        super("SwiftDzire",10);
    }
    @Override
    public String startEngine() {
        return  getClass().getSimpleName()+" startEngine";
    }

    @Override
    public String acclerate() {
        return getClass().getSimpleName()+" accelerate ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" brake";
    }
}

//class 5
class Qualis extends Car{
    public Qualis() {
        super("Qualis",10);
    }
    @Override
    public String startEngine() {
        return  getClass().getSimpleName()+" startEngine";
    }

    @Override
    public String acclerate() {
        return getClass().getSimpleName()+" accelerate ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" brake";
    }
}


//Classs main
public class Main {

    public static void main(String[] args) {

        Car car =new Car("Base indica",2);
        System.out.println(car.startEngine());
        System.out.println(car.acclerate());
        System.out.println(car.brake());

        Polo polo =new Polo();
        System.out.println(polo.startEngine());
        System.out.println(polo.acclerate());
        System.out.println(polo.brake());


        Indica indica =new Indica();
        System.out.println(indica.startEngine());
        System.out.println(indica.acclerate());
        System.out.println(indica.brake());


        Innova innova =new Innova();
        System.out.println(innova.startEngine());
        System.out.println(innova.acclerate());
        System.out.println(innova.brake());

        Qualis qualis =new Qualis();
        System.out.println(qualis.startEngine());
        System.out.println(qualis.acclerate());
        System.out.println(qualis.brake());

        SwiftDzire swiftDzire =new SwiftDzire();
        System.out.println(swiftDzire.startEngine());
        System.out.println(swiftDzire.acclerate());
        System.out.println(swiftDzire.brake());


    }


      /*
        for(int i=1;i<=10;i++){
            Car car = randomCar(); //UPCASTING
            System.out.println("Car # "+ i +" "+car.getCarName()+ "\n"+
                    "startEngine"+car.startEngine()+"\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Car was "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Polo();
            case 2:
                return new Indica();
            case 3:
                return new Innova();
        }
        return null;
    }
       */
}

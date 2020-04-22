package com.roshan;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Raja",8,3,2,4,1,32,"Silky Brown");
        //dog.eat();
        dog.walk();
        //dog.run();


        Goat goat = new Goat("Pari",4,40,2,4,32,1,3,"Softy White");
        goat.move(2);
        goat.run();
        goat.eat();


        //for learning static and instance variables
        Person baby=new Person("Veer");
        Person boy=new Person("Vevaan");

        baby.printName();
        boy.printName();

    }
}

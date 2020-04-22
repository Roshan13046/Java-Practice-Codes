package com.roshan;
//INHERITANCE,METHOD OVERLOADING,OVERRIDING,STATIC & INSTANCE VARIABLES,METHODS.......etc
public class Dog extends Animal{      //NOTE:extends keyword

    private int eyes,legs,tail,teeth;
    private String coat;


    public Dog(String name ,int size, int weight,int eyes,int legs,int tail,int teeth,String coat ) {
        super(name,1,1, size, weight);//1 for body,brain it's common for all             //NOTE:super keyword
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chew's food");
    }


    @Override
    //same function in base class and derived class but to give a special unique charateristics
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called ");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called ");
        super.move(10);//this will call the super class move function

        move(10); //this will call the over ridden method move of dog class
        //if there is overrideen move function in dog class otherwise it will call
        // the move function of the super class Animal *once try to comment out the
        // move method of the dog class it wiil call the super class move method ....
    }

    public void moveLegs(){
        System.out.println("Dog moveLegs called ");
    }



    //once try to comment out this overriden method if you do so then it will call the
    //move method of super Animal class function.........
    @Override
    public void move(int speed) {
        System.out.println("Dog move called");
        moveLegs();
        super.move(speed); //will call super class method
    }
}

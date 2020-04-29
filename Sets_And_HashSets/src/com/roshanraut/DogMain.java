package com.roshanraut;

public class DogMain {
    public static void main(String[] args) {
        Labrador raja = new Labrador("Raja");
        Dog raja2 = new Dog("Raja");

        //if not commented the Overriden equals method of Labrador class:
        //O/P: true false:Reason : Labrador is an instance of Dog so retuns true but Dog is not an instance of Labrador so return false

        //if commented the Overriden equals method of Labrador class:
        //O/P: true true

        System.out.println(raja2.equals(raja));
        System.out.println(raja.equals(raja2));
    }
}

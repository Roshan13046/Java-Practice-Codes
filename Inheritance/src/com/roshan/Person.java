package com.roshan;
//learning static and instance variables
public class Person {
    //Instance varaibles
    /*
            output:
                    Veer
                    Vevaan
     */
    private String name;

    public Person(String name){
        this.name=name;
    }

    public void printName(){
        System.out.println(name);
    }


    /* static variables
    private static String name; //Note :static keyword

    public Person(String name){
        this.name=name;//or Person.name=name or name=name
    }
    public void printName(){
        System.out.println(name);
    }

    Outputs:
            vevaan
            vevaan


    Static Variables:
     1)They are created using static keyword and are shared among all the instances of that class
     2)they are common for all the instances(objects) of the class and are
     created only once and only one memory space is allocated
    3)Changes by any object in  static varaible is valid for all other objects

    Instance varaibles:
    1)They dont use static keyword
    2)Instance variables are known as fields or member varaibles
    3)Instance varaible belong specific class
    4)Every instance hass it's own copy of an instance varaible
    5)Every instance can have different value
    6)instance varaible represents instance/state of a class
     */
}

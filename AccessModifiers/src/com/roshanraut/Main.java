package com.roshanraut;


public class Main {

    public  static int a=10;
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.balance);
        System.out.println("a : "+a);
        System.out.println("Ans : " + Start(10));



        //Static and final concepts
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println("Final one : "+one.getClassNo());
        System.out.println("final two : "+two.getClassNo());
        System.out.println("final three : "+three.getClassNo());

//        one.classNo = 4; //Error for final variable
        SomeClass.stat = 1220;//Not an error for static variable
        //So final var value cannot be changed once initialized .
        //Every instance of that class will have particular final variable.
        //Separate memory isallocated for every final varaible for every instance
        //and they are not shared among diffrerent instances of class lke static var.

        //so static var value is creted only once in class and shared among all the instances of the class
        //It's having inly one copy of it .and it's value can be changed .

//public staic final int CONSTANT =3.1425;
        // constants values cant be changed once initialised so given final and
        //constants value should be shared among the foelds and methods of that class
        //so no need of creating separate copies of it so fiven static keyword to constants.
        System.out.println(Math.PI);
        //Math m = new Math();//math class is a final  class so
        // cant instaiate it and cant etend it.

        //Application of static final in passwords and databases cryptography
        Password password = new Password(12345);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(12345);//Correct password
        password.letMeIn(-1);

        //Problem comes if someone overrides the method storepassword(); in subclass


        //"***********OverRiding of storedPassword function leads to DataInsecurity*******"
        //This can be fixed by making the storePassword function as final so it can't be overridden in extended class
        Password password1 = new ExtendedPassword(12345);
        password1.letMeIn(1);
        password1.letMeIn(12345);//Correct password1
        password1.letMeIn(-1);


    }

    public static int Start(int n){
        return a*n;
    }
    /*Static method cannot access non static methods or fields
    but nonstatic methods can acess static fields or methods.
     */



}

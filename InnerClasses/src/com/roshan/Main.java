package com.roshan;

import java.util.Scanner;
/*
Inner Class:
1)Member Class:
class A{
       private int i;
       class B{
       private int j;
     }
}
main()
{
    A a = new A();
    A.B b = a.new B();  //NOTE::
]

2)static/Nested member inner class
class A{
       private static int i;

       static class B{
        private int j;
     }
}
main()
{
    A a = new A();
    A.B b = new A.B();      //NOTE:
}

3)Anonymus Inner Class
class Phone{
    public void show(){
    sout("dbfjh");
}

main()
{
    Phone p = new Phone()
            {
  //This is anonumus inner class
                public void show()
                {
                    sout("hello !!!!!!!!!");
                }
            };
       p.show();
}



//Anonymus Inner class using Interfaces

//It's is functional interface :
An innterface having only one Method is functional interface...
Inerface Phone{
    public void show();
}

main()
{
    Phone p = new Phone()
            {
  //This is anonumus inner class
                public void show()
                {
                    sout("dchd knfk, kfhbb  ,kjfn");
                }
            };
       p.show();
}


//OR using LAMBDA expression in JAVA 8 version
main()
{
    Phone p =()->  sout("dchd knfk, kfhbb  ,kjfn");

//OR for Multiplle statements...use  :::            {};
 Phone p =()->{
   sout("dchd knfk, kfhbb  ,kjfn");
    sout("Gsg ");
    sout("Hi jjjjjjjjjjjjjjjj");
    };



       p.show();
}




 */





public class Main {

    //for button challenge
    private static Scanner scanner = new Scanner(System.in);
    private static Button printButton = new Button("Print");



    public static void main(String[] args) {
        //NOTE:SYNTAX
	  //  Gearbox innova = new Gearbox(7);
	    //for inner class we reference the outer class to inner class using below syntax
	//    Gearbox.Gear first = innova.new Gear(1,12.3);

	    //Errors:
     //   Gearbox.Gear second = new Gearbox.Gear(2,24);          //Error
     //   Gearbox.Gear third = new innova.Gear(3,36,7);          //Error


        //if addgear is included inside the constructor itself
//        innova.addGears(1,7.5);
//        innova.addGears(2,15);
//        innova.addGears(3,22.5);

        /*
        innova.setClutchIsIn(true);
        innova.changeGear(1);
        innova.setClutchIsIn(false);
        System.out.println(innova.wheelSpeed(100));
        innova.changeGear(2);
        System.out.println(innova.wheelSpeed(1000));
        innova.setClutchIsIn(true);
        innova.changeGear(3);
        innova.setClutchIsIn(false);
        System.out.println(innova.wheelSpeed(1000));
*/

        //for Button Challenge
        /*Local class
        class ClickListner implements Button.OnClickListner {
            public ClickListner(){
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was Clicked ");
            }
        }
        printButton.setOnClickListner(new ClickListner());
        listner();
         */

        /********Anonymus class :
         * These are local class with no name: they are declared
         * and instantiated at same time as they have no name .
         * they are used when the local classes are required only once
         * mostly used in Android Apps.
         */

        printButton.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked ");
            }
        });
        listner();
    }

    private static void listner(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    quit = true;
                    break;
                case  1:
                    printButton.onClick();
            }
        }
    }

}

package com.roshan;

public class Main {
/*Encapsualtion :
problems if not using Encapsulation
1)Being able to access the fields  values of player class are controlled by calling class
2)Any time we are changing the name of fields or methods then it needs a change everywhere if it
s used in other class.
3)If all the fields are not initialized it may lead to garbage value........

 */

    public static void main(String[] args) {
        /*
        //Insecure Data variables..........

        Player player =new Player();
        player.name="Roshan";

        player.health=200;
        player.weapon="Machine Gun";
        int damage =10;
        player.looseHealth(damage);
        System.out.println("Remaining health :"+player.healthRemaining());
        */

        EnhancedPlayer player =new EnhancedPlayer("Roshan","AK 47",200);
        System.out.println("Remain Health : "+player.getHealth());

        /*Part 2: Challenge of Encapsualtion

        Create a class and Demonstrate a proper Encapsulation technique.
        Class to create is Printer it's demonstrate Laser printer
        it should have fields of toner level ,no of pages printed and also whether it's a duplex printer
        (capable of printing on both sides of page)
        add method to fill up the toner level (upto max of 100%),another method to
        simulate printing a page (which should increase the number of pages printed)
        Decide on the scope ,whether the constructor and anything else you think is needed
        */

        Printer laserPrinter = new Printer(50,true);
        System.out.println("Toner Level : " + laserPrinter.fillTonerLevel(55555));
        System.out.println("Pages To Print " + laserPrinter.noOfPagesPrint(1111) + " and Total Pages Printed : "+ laserPrinter.totalPagesPrinted());
        System.out.println();

    }

}

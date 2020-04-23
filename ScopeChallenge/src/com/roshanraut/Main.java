package com.roshanraut;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Write a small program to read an integer from the keyboard.
	    *using scanner and print out the times for that number.
	    * The table should run from 1 to 12.
	    *
	    * You are allowed to use one variable called scanner for your Scanner instance .
	    * You can use as many variables as you need,but they must all be called x.That includes
	    * any class instances and loop contains variables that you may decide to use.
	    *
	    * If you use a class ,the class can be called X ,capital,but any instances of it must be called linear case.
	    * Any methods you create must also X.
	    * Optimal Extra:
	    * Change your program so that all variables (including the scanner instance ) are called x;
	     */
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a num : " );
		X x = new X(new Scanner(System.in));
        x.x();
    }
}

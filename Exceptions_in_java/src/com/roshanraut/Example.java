package com.roshanraut;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
/*
Also try to press ( ctrl+ D ) while inputting to check that  NoSuchElementException
is working correctly or not along with the InputMismatchError ......
 */

    public static void main(String[] args) {
      try{
          //using bitwise OR operator to handle exception in java 7,8 versions
//as multi catches are not supported in before java versions of 7.
          int result = divide();
          System.out.println(result);
      }catch (ArithmeticException | NoSuchElementException e){
          System.out.println(e.toString());
          System.out.println("Unable to perform division , autopilot shut down");
      }
    }
//
//    private static int divide(){
//        int x = getInt();
//        int y= getInt();
//
//        System.out.println("x is "+ x +" y is "+y );
//        return x/y;
//    }


    /*
//This will handle NoSuchElementException
    private static int divide(){
        int x,y;
        try{
            x = getInt();
            y= getInt();
        }catch (NoSuchElementException e){
//            x = getInt();//NOTE : There must be no InputMisMAtchException Exception occuring stmt inside the catch block like this
            throw new ArithmeticException("No suitable input");
        }
        System.out.println("x is "+ x +" y is "+y );
        try {
            return x / y;
        }catch(ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
    }
    */


    //handling multi catch exceptions
    private static int divide(){
        int x,y;
        try{
            x = getInt();
            y= getInt();
            System.out.println("x is "+ x +" y is "+y );
            return x / y;
        }catch (NoSuchElementException e){
//            x = getInt();//NOTE : There must be no InputMisMAtchException Exception occuring stmt inside the catch block like this
            throw new NoSuchElementException("No suitable input");
        }catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero ");
        }
    }




    //We can't handle NoSuchElementException using InputMisMAtchException
    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an input integer : ");
        while(true){
            try{
                return scanner.nextInt();
            }catch(InputMismatchException e){
                //going round again Read the end of line in the input first
                scanner.nextLine();
                System.out.println("Please enter a number with digits from 0 to 9");
            }
        }
    }

}

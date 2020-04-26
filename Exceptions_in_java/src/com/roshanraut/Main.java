package com.roshanraut;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    int x=3,y=0;
//
//        System.out.println(LBYL(3,0));
//        System.out.println(EASP(3,0));
//        System.out.println(divide(3,0));
//
//        int x=getIntLBYL();
//        System.out.println("x is "+x);
//
//        int x=getIntEAFP();
//        System.out.println("x is "+x);


  }

/*
    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        String input = scanner.next();
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i)) == false){ //Note : syntax
                return 0;
            }
        }
        return Integer.parseInt(input);
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        try{
            return scanner.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }


    //Look before you leave
    private static int LBYL(int x,int y){
        if(y!=0){
            return x/y;
        }else {
            return 0;
        }
    }
//Easy to ask for permission
    private static int EASP(int x,int y){
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }
 //dividing without handling exceptions
    private static int divide(int x,int y){
        return x/y;
    }

 */
}

package com.roshan;

import java.util.ArrayList;
import java.util.Scanner;


class IntClass{
    private int number;

     public IntClass(int number) {
         this.number = number;
     }

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }
 }




public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //************************************** WRONG SYNTAX ****************************
        /*
        ArrayList<int> intArrayList = new ArrayList<int>();
        intArrayList.set(0,12);

        Note : ArrayList <non-primitive DataType> it must have non-primitive Data type of Class
        */
         ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
         for(int i=0 ;i < 10 ;i++){
             intClassArrayList.add(i,new IntClass(i+1));
         }

         for(int i=0 ;i<intClassArrayList.size();i++){
             System.out.println(intClassArrayList.get(i).getNumber()+" ");
         }

         ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
         for(int i=0 ;i<10;i++){
             integerArrayList.add(Integer.valueOf(i));
         }

         for(int i=0 ;i<integerArrayList.size();i++){
             System.out.println(i + " ----> "+ integerArrayList.get(i).intValue());
         }

         ArrayList<Double> doubleArrayList = new ArrayList<Double>();
         for(double dbl = 0 ; dbl < 10.0 ;dbl += 1.0){
             doubleArrayList.add(Double.valueOf(dbl));
         }

         for(int i=0;i<doubleArrayList.size() ; i++){
             System.out.println(i + " ----> "+ doubleArrayList.get(i).doubleValue());
         }

         ArrayList<Long> longArrayList = new ArrayList<Long>();
        System.out.print("Enter the number of inputs Size : ");
        int noOfElements = scanner.nextInt();

         for(int i=0;i< noOfElements ;i++){
             System.out.print("Enter long integer "+(i+1) +" : " );
             longArrayList.add(Long.valueOf(scanner.nextLong()));
         }

        System.out.println("The Long values are : ");
         for(int i=0;i<longArrayList.size();i++){
             System.out.println("Value "+(i+1) + " : "+longArrayList.get(i).longValue());
         }
    }
}

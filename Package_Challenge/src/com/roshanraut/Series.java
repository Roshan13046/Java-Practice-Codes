package com.roshanraut;

public class Series {
    /*
    *nSum(int n) returns the sum of all numbers from 0 to n.The first 10 numbers are:
        0,1,2,3,6,10,15,21,28,36,45,55.
        factorial(int n) returns the product of all numbers from 1 to n
            i.e 1*2*3....*(n-1)*n.
          The first 10 factorials are:
          0 ,1,2,6,24,120,720.....

          Fibonacci(n) returns the nth fibonacci number.These are defined as:
          f(0) = 0
          f(1) = 1
          f(n) = f(n-1)+f(n-2);
          so f(2) is also 1.The first 10 fibonacci numbers are:
          0,1,1,2,3,5,8,13,21,34,55.

     */

    public static int nSum(int n){
        return n*(n+1)/2;
    }

    public static  int factorial(int n){
        if(n==0 || n==1)
             return 1;

        return n*factorial(n-1);
    }


    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

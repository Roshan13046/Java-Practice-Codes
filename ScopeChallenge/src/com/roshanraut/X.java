package com.roshanraut;

import java.util.Scanner;

public class X {
    private int x;
//
//    public X(int x) {
//        this.x = x;
//    }
    public X(Scanner x){
        System.out.print("Please Enter a number : ");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x=1; x<= this.x;x++)
            System.out.println(x*this.x);
    }
}

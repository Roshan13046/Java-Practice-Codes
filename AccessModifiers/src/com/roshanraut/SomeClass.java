package com.roshanraut;

public class SomeClass {
    public static  int stat = 0;
    public final int classNo = stat ;
    public String string;

    public SomeClass(String string) {
        this.string = string;
    }

    public int getClassNo() {
        return classNo;
    }
}

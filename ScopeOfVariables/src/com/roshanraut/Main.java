package com.roshanraut;

public class Main {

    public static void main(String[] args) {
	    ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("ScopeCheck privateVar : "+scopeCheck.getPrivateVar());
        scopeCheck.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();

        System.out.println("Inner Class Private var : "+innerClass.privateVar);
        innerClass.timesTwo();

        scopeCheck.accessPrivateVarOfInnerClass();
    }
}

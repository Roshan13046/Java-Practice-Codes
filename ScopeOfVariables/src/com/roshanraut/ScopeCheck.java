package com.roshanraut;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("Scope Check created publicVar : "+publicVar+" privateVar : "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar =3;
        System.out.println( "privateVar "+privateVar +" times 2 = "+privateVar*2);
    }

    public void accessPrivateVarOfInnerClass(){
        InnerClass innerClass = this.new InnerClass();
        System.out.println("Private member of inner class is : "+innerClass.var2);
    }

    public class InnerClass{
        public int privateVar = 5;
        private int var2 = 123;
        public InnerClass(){
            System.out.println("Inner Class created,private is "+privateVar);
        }

        public void timesTwo(){
//            int privateVar =3;
            System.out.println( "privateVar "+ScopeCheck.this.privateVar +" times 2 = "+ScopeCheck.this.privateVar*2);
        }
    }
}


package com.roshanraut;

public class Labrador extends Dog {
    public Labrador(String name){
        super(name);
    }
//
//    @Override
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Labrador){
//            String objName =((Labrador)obj).getName();//Note:Typecasting
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}

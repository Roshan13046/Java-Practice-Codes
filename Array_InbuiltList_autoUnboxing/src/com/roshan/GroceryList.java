package com.roshan;

import java.util.ArrayList;
//Note: ArrayList is a resizeable ArrayList Class



public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>() ;


    public void addGroceryItem (String item){
        groceryList.add(item);
    }

    public void printGroceryList (){
        System.out.println("You have " + groceryList.size() + " items in Grocery List " );
        for(int i=0;i<groceryList.size() ; i++){
            System.out.println("Item "+ (i+1) + groceryList.get(i));
        }
    }

    public void modifyGroceryList (int position ,String newItem){
        groceryList.set(position , newItem);
        System.out.println("Grocery item " + (position + 1 ) + " has ben modified");
    }

    public void removeGroceryList (int position ){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String finditem (String searchItem){
        boolean exists = groceryList.contains(searchItem);
        if(exists){
            int position = groceryList.indexOf(searchItem);
            if(position != -1){
                return groceryList.get(position);
            }
        }
            return null;
    }
}

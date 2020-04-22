package com.roshan;

import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>() ;

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem (String item){
        groceryList.add(item);
    }

    public void printGroceryList (){
        System.out.println("You have " + groceryList.size() + " items in Grocery List " );
        for(int i=0;i<groceryList.size() ; i++){
            System.out.println("Item "+ (i+1) +" : " + groceryList.get(i));
        }
    }

    public  void modifyGroceryList(String currentItem , String newItem){
        int position = findItem(currentItem);
        if(position != -1){
            modifyGroceryList(position,newItem);
        }
    }

    public void modifyGroceryList (int position ,String newItem){
        groceryList.set(position , newItem);
        System.out.println("Grocery item " + (position + 1 ) + " has ben modified");
    }
    public void removeGroceryItem (String item){
        int position = findItem(item);
        if(position !=-1){
            removeGroceryList(position);
        }
    }

    public void removeGroceryList (int position ){
        groceryList.remove(position);
    }

    public int findItem (String searchItem){
      return groceryList.indexOf(searchItem);
    }
}

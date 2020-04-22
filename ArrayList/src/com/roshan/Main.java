package com.roshan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	   boolean quit = false;
	   int choice = 0;
	   printInstructions();
	   while(!quit){
           System.out.print("Enter your Choice :  ");
           choice = scanner.nextInt();
           scanner.nextLine();

           switch(choice){
               case 0 :
                   printInstructions();
                   break;
               case 1 :
                   groceryList.printGroceryList();
                   break;
               case 2:
                   addItem();
                   break;
               case 3:
                   modifyItem();
                   break;
               case 4:
                   removeItem();
                   break;
               case 5:
                   findItem();
                   break;
               case 6:
                   copyListItems();
                   break;
               case 7:
                   quit = true;
                   break;
           }
       }
    }

    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0- To print Choice options.");
        System.out.println("\t 1- To print the List of grocery items.");
        System.out.println("\t 2- To Add an item in List.");
        System.out.println("\t 3- To Modify an item in List.");
        System.out.println("\t 4- To Remove an item from List.");
        System.out.println("\t 5- To Find an item in List.");
        System.out.println("\t 6- To Copy All items of List.");
        System.out.println("\t 7- To Exit from the Application.");
    }

    public static void addItem(){
        System.out.print("Please Enter the Grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter ItemName to Modify :  ");
        String itemName = scanner.nextLine();
        System.out.println("Enter Replacement Item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemName , newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name to remove :");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void findItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != -1 ){
            System.out.println("Found "+ searchItem + " in our grocery List ");
        }else{
            System.out.println(searchItem + " is not is groceryList. ");
        }
    }

    //Various ways to Copy all the contents of arrayList in anotherArray

    public static void copyListItems(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //or can do in one single stmt
        ArrayList<String> newArray2 = new ArrayList<String>(groceryList.getGroceryList());

        //or another method to copy all contents of Arraylist once
        String [] newArray3 = new String[groceryList.getGroceryList().size()];
        newArray3 = groceryList.getGroceryList().toArray(newArray3);
    }

}

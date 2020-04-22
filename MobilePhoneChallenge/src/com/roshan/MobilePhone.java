package com.roshan;

import java.util.Scanner;

/*
        Create a program that implements a simple mobile Phone with the folloeing capabilities
        Able to store ,Modify,remove and Query Contact names.
        You will want to create a separate class for Contacts(name and ph no)
        Create another class (mobile phone) that holds the arrayList of contacts
        The mobilePhone class has the functionality listed above
        Add a menu of options that are available
        options :
        Quit , print list of Contacts , add new contact ,update existing contact , remove contact and searchFind conact
        When adding or updating be sure to check if the contact already exists (use name)
        Be sure not to expose inner working of the arraylist to mobilePhone
        eg: no ints , no get(i) etc;
        MobilePhones should do everything with Contact Objects only...............
        */
public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactList contactList = new ContactList();

    public static void mobileFunctionality(){
        boolean quit = false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    contactList.printContactList();
                    break;
                case 2 :
                    addNewContact();
                    break;
                case 3 :
                    updateExistingContact();
                    break;
                case 4 :
                    deleteExistingContact();
                    break;
                case 5 :
                    searchExistingContact();
                    break;
                case 6 :
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press");
        System.out.println("\t0- To print Choice options.");
        System.out.println("\t1- To print the Contact List.");
        System.out.println("\t2- To Add New Contact.");
        System.out.println("\t3- To Update Existing Contact.");
        System.out.println("\t4- To Delete a Contact.");
        System.out.println("\t5- To Search a Contact.");
        System.out.println("\t6- To Exit from the Application.");
    }

    public static void addNewContact(){

        System.out.print("Please Enter the Name : ");
        String name = scanner.nextLine();
        System.out.print("Please Enter the Ph no : ");
        String phNo = scanner.nextLine();
        contactList.addNewContact(new Contact(name,phNo)) ;
    }

    public static void updateExistingContact(){
        System.out.print("Enter Name to Modify :");
        String contactName = scanner.nextLine();
        System.out.println("Enter Modified Name : ");
        String modifyName = scanner.nextLine();
        contactList.updateContact(contactName , modifyName);
    }

    public static void deleteExistingContact(){
        System.out.println("Enter Contact Name to Delete : ");
        String contactName = scanner.nextLine();
        contactList.deleteContact(contactName);
    }

    public static void searchExistingContact(){
        System.out.println("Contact Name to search : ");
        String searchName = scanner.nextLine();
        if(contactList.searchContact(searchName,null) != -1){
            System.out.println("Found "+ searchName + " in Contact List ");
        }else{
            System.out.println(searchName + " is not in Contact List");
        }
    }
}

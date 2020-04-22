package com.roshan;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Umobile {
    private static Scanner scanner = new Scanner(System.in);
    private static UmobilePhone umobilePhone = new UmobilePhone("914658860",new ArrayList<UContact>());


    private static void printContact(){
        umobilePhone.printContact();
    }

    public  void startPhone() {
        System.out.println("Starting phone...............");
        boolean quit = false;
        printInstruction();
        int choice = 0;

        while(!quit){
            System.out.print("Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0 :
                    printInstruction();
                    break;
                case 1 :
                    printContact();
                    break;
                case 2 :
                    addNewcontact();
                    break;
                case 3 :
                    updateExistingContact();
                    break;
                case 4 :
                    removeExistingContact();
                    break;
                case 5 :
                    queryContact();
                    break;
                case 6 :
                    quit = true;
                    break;
            }
        }
    }

    private static void updateExistingContact(){
        System.out.print("Enter Name to Modify :");
        String contactName = scanner.nextLine();
        UContact oldContact = umobilePhone.queryContact(contactName);
        if(oldContact == null){
            System.out.println("Contact not Found");
            return ;
        }
        System.out.println("Enter New Contact name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter New Contact phone Number : ");
        String newPhoneNumber = scanner.nextLine();
        UContact newContact = UContact.createContact(newName,newPhoneNumber);
        if(umobilePhone.updateContact(oldContact,newContact)){
            System.out.println("Successfully Updated record.");
        }else{
            System.out.println("Error Updating recordList");
        }
    }

     private static void removeExistingContact(){
         System.out.print("Enter Name to Delete :");
         String contactName = scanner.nextLine();
         UContact existingContact = umobilePhone.queryContact(contactName);
         if(existingContact == null){
             System.out.println("Contact not Found");
             return ;
         }
         if(umobilePhone.removeContact(existingContact)){
             System.out.println("Successfully deleted");
         }else{
             System.out.println("Error deleting contact");
         }
     }


    private static void queryContact(){
        System.out.print("Enter Name to Search :");
        String contactName = scanner.nextLine();
        UContact existingContact = umobilePhone.queryContact(contactName);
        if(existingContact == null){
            System.out.println("Contact not Found");
            return ;
        }
        System.out.println("Name : "+existingContact.getName() + " phone Number is "+existingContact.getPhoneNumber());
    }


    private static void addNewcontact(){
         System.out.print("Please Enter the Name : ");
         String name = scanner.nextLine();
         System.out.print("Please Enter the Ph no : ");
         String phNo = scanner.nextLine();
         if(umobilePhone.addNewContact(UContact.createContact(name,phNo))){
             System.out.println("New Contact added : name =  "+ name + " ,phone = "+phNo);
         }else{
             System.out.println("Contact add, "+name +" already Exists on File");
         }
     }

    public static void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t0- To print Choice options.");
        System.out.println("\t1- To print the Contact List.");
        System.out.println("\t2- To Add New Contact.");
        System.out.println("\t3- To Update  Contact.");
        System.out.println("\t4- To Delete a Contact.");
        System.out.println("\t5- To Search a Contact.");
        System.out.println("\t6- To Exit from the Application.");
    }
}

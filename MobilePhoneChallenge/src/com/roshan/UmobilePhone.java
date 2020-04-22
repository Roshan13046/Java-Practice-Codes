package com.roshan;

import java.util.ArrayList;

public class UmobilePhone {
    private String myNumber;
    private ArrayList<UContact>myContact;

    public UmobilePhone(String myNumber, ArrayList<UContact> myContact) {
        this.myNumber = myNumber;
        this.myContact = myContact;
    }

    public boolean addNewContact(UContact contact){
        if(findContact(contact.getName()) != -1){
            System.out.println("Contact is already in file");
            return false;
        }
        myContact.add(contact);
        return true;
    }
    public boolean updateContact(UContact oldContact , UContact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition == -1){
            System.out.println(oldContact.getName() + " ,was not found. ");
            return false;
        }
        this.myContact.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + ", was replaced with "+newContact.getName());
        return true;
    }

    public boolean removeContact(UContact contact){
        int foundPosition = findContact(contact);
        if(foundPosition == -1){
            System.out.println(contact.getName() + " ,was not found. ");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName()+",was successfully deleted.");
        return true;
    }


    private int findContact(UContact contact){
        return this.myContact.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i=0 ;i<this.myContact.size();i++){
            UContact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public UContact queryContact(String name){
        int position = findContact(name);
        if(position != -1){
            return this.myContact.get(position);
        }
        return null;
    }

    public String queryContact(UContact contact){
        if(findContact(contact) != -1){
            return contact.getName();
        }
        return null;
    }

    public void printContact(){
        System.out.println("The Contact List has "+myContact.size() + " Contacts .");
        for(int i=0;i<myContact.size();i++){
            System.out.println((i+1) + " "+ this.myContact.get(i).getName() + " -> "+this.myContact.get(i).getPhoneNumber());
        }
    }
}

package com.roshan;

import java.util.ArrayList;

/*
        Create a program that implements a simple mobile Phone with the folloeing capabilities
        Able to store ,Modify,remove and Query Contact names.
        You will want to create a separate class for Contacts(name and ph no)
        Create another class (mobile phone) that holds the arrayList of contacts
        The mobilePhone class has the functionality listed above
        Add a menu of options that are available
        options :
        Quit , print list of Contacts , add new contact ,update existing contact , receive contact and searchFind conact
        When adding or updating be sure to check if the contact already exists (use name)
        Be sure not to expose inner working of the arraylist to mobilePhone
        eg: no ints , no get(i) etc;
        MobilePhones should do everything with Contact Objects only...................
 */
public class ContactList {
    private ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    public void addNewContact(Contact contact){
        contactArrayList.add(contact);
    }

    public void printContactList(){
        System.out.println("There are Total "+ contactArrayList.size() + " contacts in Contact List ");
        for(int i=0 ;i<contactArrayList.size() ;i++){
            System.out.println("Contact "+ (i+1) + " : "+ contactArrayList.get(i).name + " "+contactArrayList.get(i).phNo);
        }
    }

    public void updateContact(String oldName , String newName){
        int position = searchContact(oldName , null);
        if(position != -1){
            updateContact(position,newName);
        }
    }

    public void updateContact(int position ,String newName){
        contactArrayList.get(position).name = newName;
        System.out.println("Contact List " + (position+1) + " has been Modified ");
    }

    public void deleteContact(String contactName){
        int position = searchContact(contactName , null);
        if(position != -1){
            deleteContact(position);
        }
    }

    public void deleteContact(int position){
        contactArrayList.remove(position);
    }


    public int searchContact(String contactName , String phoneNo){
        for(int i=0;i<contactArrayList.size();i++){
            if(contactArrayList.get(i).name.equals(contactName) ||contactArrayList.get(i).phNo.equals(phoneNo) ){
                return i;
            }
        }
        return -1;
    }


}

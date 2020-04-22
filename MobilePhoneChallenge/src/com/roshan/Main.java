package com.roshan;

public class Main {
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
 MobilePhones should do everything with Contact Objects only...............
 */
    public static void main(String[] args) {
        /*
        MobilePhone mobilePhone = new MobilePhone();
        MobilePhone.mobileFunctionality();

         */

        ///Udemy  Contact Method............................................
        Umobile umobile = new Umobile();
        umobile.startPhone();
    }
}

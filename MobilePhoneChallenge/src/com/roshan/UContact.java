package com.roshan;

public class UContact {
    private String name;
    private String phoneNumber;

    public UContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static UContact  createContact(String name,String phoneNumber){
        return new UContact(name,phoneNumber);
    }
}

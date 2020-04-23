package com.roshanraut;

public class Password {
    private static final int key = 123;
    private final int encrytedPasssword;

    public Password(int password) {
        this.encrytedPasssword = encryptDecrypt(password);
    }
    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Stored Password as "+ this.encrytedPasssword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password)  == this.encrytedPasssword){
            System.out.println(" WELCOME ");
            return true;
        }else{
            System.out.println("Wrong Password Entered");
            return false;
        }
    }
}

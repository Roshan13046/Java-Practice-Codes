package com.roshan;

public class DeskPhone  implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing "+ phoneNumber+" on desktop");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the PhoneNumber");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

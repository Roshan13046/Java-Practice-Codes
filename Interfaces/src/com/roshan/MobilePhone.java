package com.roshan;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("No action taken,mobile phone does no have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now Ringing "+ phoneNumber+" on desktop");
        }else{
            System.out.println("Phone is Switched Off");
        }
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
            System.out.println("Mobile phone is not ringing");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

package com.roshan;
//Interface : it specifies methods that a particular class  implements.It's is an abstratct
//there is no actal code it's just a declration it's a way to standardize the way a particular class is implemented
//it's is used to immplemnt multiple inheritance in java........................................
public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public  boolean isRinging();
}

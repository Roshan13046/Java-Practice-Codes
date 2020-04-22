package com.roshan;


 private static double PI = Math.PI;//constant PI
public class Innova extends Car {

    private int roadServicemonths;;

    public Innova(int roadServicemonths) {
        super("InovvaTourist", "6 seater",4, 4, 4,false);
        this.roadServicemonths = roadServicemonths;
    }
    public void accelerate(int rate){

        int newVelocity=getCurrentVelocity()+rate;
        if(newVelocity == 0){
            stop();
        }else if(newVelocity>=0 && newVelocity<=10){
            changedGear(1);
        }else if(newVelocity>10 && newVelocity<=20){
          changedGear(2);
        } else if(newVelocity >20 && newVelocity<=30){
            changedGear(3);
        }else{
            changedGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}

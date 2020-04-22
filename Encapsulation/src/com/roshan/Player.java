package com.roshan;


//UnProtected Data members: Dont requires public data members generally
public class Player {
//Note :public data members
    public String name,weapon;
    public int health;

    public void looseHealth(int damage){
        this.health -=damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }



}

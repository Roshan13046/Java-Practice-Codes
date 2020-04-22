package com.roshan;

//RENAME :Select tthe instance variable  then press  SHIFT + F6



public class EnhancedPlayer {
    private String name,weapon;
    private int healthStatus = 100;

    public EnhancedPlayer(String name,String weapon,int health){
        this.name = name;
        if(health >=0 && health <=100){
            this.healthStatus = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        this.healthStatus -= damage;
        if(this.healthStatus <= 0){
            System.out.println("Player Knock out");
        }
    }

    public int getHealth() {
        return healthStatus;
    }
}

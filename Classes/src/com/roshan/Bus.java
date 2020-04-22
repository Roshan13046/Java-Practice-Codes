package com.roshan;

public class Bus {
    public int wheel;
    public int doors;
    public String model;
    public String  engine;


    //validation checker for objects
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("Volvo") || validModel.equals("Tata")){
            this.model=model;
        }else{
            this.model="Unknown";
        }
    }
    public void setDoors(int  doors){
        this.doors=doors;
    }
    public void setWheel(int wheel){
        this.wheel=wheel;
    }
    public void setEngine(String engine){
        this.engine=engine;
    }

//getters
    public String getModel(){
        return this.model;
    }
     public int getDoors(){
        return this.doors;
    }
    public int getWheel(){
        return this.wheel;
    }
    public String getEngine(){
        return this.engine;
    }
}

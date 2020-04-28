package com.roshanraut;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;              //final bcz once value is initialized in constructor it can't be changed
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String,Integer>();
        this.exits.put("Quit",0);
    }

    public void addExit(String direction,int location){
        exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //Not using return exits; bcz the outsider calling methods may change the map data
        return new HashMap<String, Integer>(exits);//Note:here we are creating a duplicate copy of exits and passing to outside
        //beacause the outsiders should not be able to change the actual map data and keys
    }
}

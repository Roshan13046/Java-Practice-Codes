package com.roshanraut;

public class Planets extends HeavenlyBody{
    public Planets(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }
    }
}

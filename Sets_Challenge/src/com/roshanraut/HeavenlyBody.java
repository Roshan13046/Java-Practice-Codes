package com.roshanraut;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite;
    private final BodyTypes bodyType;

    public enum BodyTypes{
        STAR,PLANET,DRAWF_PLANET,MOON,COMET,ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = new HashSet<>();
        this.bodyType = bodyType ;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon){
       return this.satellite.add(moon);
    }

    public Set<HeavenlyBody> getSatellite() {
        //not written bcz outer objects should not make the changes in satellite sets.
        //return this.satellite;
        return new HashSet<>(this.satellite);//return duplicate copy of satellite
    }

    //Overriding the Existing equals method to prevent duplicate objects in sets eg:pluto
    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody)obj;
            if(this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
       // return super.hashCode();
        return this.name.hashCode() + 57 + this.bodyType.hashCode();//Note : addded (57/any no ) to generate uniqie codes
    }
    @Override
    public String toString(){
        return this.name+" "+this.bodyType+" , "+this.orbitalPeriod;
    }


//Not Used yet
//    //Subclass key
//    public static final class Key{
//        private String name;
//        private BodyTypes bodyTypes;
//
//        public Key(String name, BodyTypes bodyTypes) {
//            this.name = name;
//            this.bodyTypes = bodyTypes;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public BodyTypes getBodyTypes() {
//            return bodyTypes;
//        }
//
//        @Override
//        public int hashCode() {
//            return this.hashCode() + 57 +this.hashCode();
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            Key key = (Key) obj;
//            if(this.name.equals(key.getName())){
//                return (this.bodyTypes == key.getBodyTypes());
//            }
//            return false;
//        }
//    }
}

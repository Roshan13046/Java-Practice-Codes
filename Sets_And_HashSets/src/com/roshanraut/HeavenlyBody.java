package com.roshanraut;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
       return this.satellite.add(moon);
    }

    public Set<HeavenlyBody> getSatellite() {
        //not written bcz outer objects should not make the changes in satellite sets.
        //return this.satellite;
        return new HashSet<>(this.satellite);//return duplicate copy of satellite
    }

    //Overriding the Existing equals method to prevent duplicate objects in sets eg:pluto
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("Overloaded Equals method is Checked");
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }
/*
//inbuilt overried equals and hashCodes method in java

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return Double.compare(that.orbitalPeriod, orbitalPeriod) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(satellite, that.satellite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orbitalPeriod, satellite);
    }
 */
    @Override
    public int hashCode() {
       // return super.hashCode();
        System.out.println("Hash Code Called");
        return this.name.hashCode() + 57;//Note : addded (57/any no ) to generate uniqie codes
    }
}

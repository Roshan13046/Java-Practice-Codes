package com.roshanraut;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
/*
Sets are unordered collections of objects and they dont contain duplicates.
While List is an ordered collection of object which can contain duplicates.
Sets are implemented using maps ad hash sets are implemented using hashMaps.
 */
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon" ,27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos",1.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos" ,0.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter",4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io" ,1.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa" ,3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("GanyMode" ,7.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto" ,16.7);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Saturn",10795);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus",30660);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune",165);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto",248);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        System.out.println("Planets in solar System : ");
        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of "+ body.getName()+" are : ");
        for(HeavenlyBody marsMoons : body.getSatellite()){
            System.out.println("\t"+ marsMoons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellite());//Adding all moons of planet in one stmt using addAll() fun
        }

        System.out.println("All Moons : ");
        for(HeavenlyBody moon : moons){
            System.out.println("\t"+moon.getName());
        }

        //If two objects are totally equal they will have same hashCodes of the Buckets
        temp = new HeavenlyBody("Pluto",248);
        planets.add(temp);



        for(HeavenlyBody planet : planets){
            System.out.println(planet.getName()+" : "+planet.getOrbitalPeriod());
        }//Note: that pluto object is two times in Set of planets this is bcz we have not overided equals object

        Object o = new Object();
        o.equals(o);//If two objects comapre equals then they have same hashCodes
        "pluto".equals("");


    }
}

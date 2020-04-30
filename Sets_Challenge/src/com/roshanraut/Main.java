package com.roshanraut;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*Challenge  :
For each of the types that you support , subclass the heavenlyBody class so that your program can create objects of that appropriate type
Although astromnomers may shudder at this , our solar systems will allow two bodies to have the same name as long as they are not the some type of body:
so you could have a star called "BetaMinor" and an asteroid also called "BetaMinor" , for eg.

Hint : This is much easier to implement for the Set then it is for the Map,beacuse the Map will need a key that uses both fields.
There is a restriction that the only satellites that planets can have must be moon.Even if you don't implement a STAR type,though , your program sould not prevent one being added
in the future and STAR's Staellites can be almost every kind of HeavenlyBody.

Test Cases:
1.The planets and moons that we added in the previous video should appear in the solarsystem
collection and in the sets of moons for the apprpriate planets.

2.a.equals(b) must return the same result as b.equals(a) =equals is symmetric.

3)Attempting to add a duplicate to a set must result in no change to the set (so the oroiginal value is not replaced by the new one)

4)Attempting to add a duplicate to a Map results in  the original being repalcced by the new object.

5)Two bodies with the name but different designations can be added to the same set.

6)Two bodies with the same name but different designations can be added to the same map,
and can be retrived from the map.
 */
public class Main {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {

            HeavenlyBody temp = new Planets("Mercury", 88);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new Planets("Venus", 225);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new Planets("Earth", 365);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            HeavenlyBody tempMoon = new Moon("Moon", 27);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            temp = new Planets("Mars", 687);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            tempMoon = new Moon("Deimos", 1.3);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            tempMoon = new Moon("Phobos", 0.3);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            temp = new Planets("Jupiter", 4332);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            tempMoon = new Moon("Io", 1.8);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            tempMoon = new Moon("Europa", 3.5);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            tempMoon = new Moon("GanyMode", 7.3);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            tempMoon = new Moon("Callisto", 16.7);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addSatellite(tempMoon);

            temp = new Planets("Saturn", 10795);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new Planets("Uranus", 30660);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new Planets("Neptune", 165);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new Planets("Pluto", 248);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);


            System.out.println("Planets in solar System : ");
            for (HeavenlyBody planet : planets) {
                    System.out.println("\t" + planet.getName());
            }

            HeavenlyBody body = solarSystem.get("Mars");
            System.out.println("Moons of " + body.getName() + " are : ");
            for (HeavenlyBody marsMoons : body.getSatellite()) {
                    System.out.println("\t" + marsMoons.getName());
            }

            Set<HeavenlyBody> moons = new HashSet<>();
            for (HeavenlyBody planet : planets) {
                    moons.addAll(planet.getSatellite());//Adding all moons of planet in one stmt using addAll() fun
            }

            System.out.println("All Moons : ");
            for (HeavenlyBody moon : moons) {
                    System.out.println("\t" + moon.getName());
            }

            //If two objects are totally equal they will have same hashCodes of the Buckets
            HeavenlyBody pluto = new DrawfPlanet("Pluto", 842);
            planets.add(temp);

            for (HeavenlyBody planet : planets) {
                    System.out.println(planet);
            }//Note: that pluto object is two times in Set of planets this is bcz we have not overided equals object

            HeavenlyBody earth1 = new Planets("Earth",365);
            HeavenlyBody earth2 = new Planets("Earth",365);
            //Check for symmetric
            System.out.println(earth1.equals(earth2));
            System.out.println(earth2.equals(earth2));
            System.out.println(pluto.equals(earth1));
            System.out.println(earth1.equals(pluto));
    }
}

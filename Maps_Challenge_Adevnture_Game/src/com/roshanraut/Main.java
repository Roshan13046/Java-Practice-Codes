package com.roshanraut;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locationMap = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locationMap.put(0,new Location(0,"Roshan Sits and learns Java"));
        locationMap.put(1,new Location(1,"Roshan stands at Road in front of building"));
        locationMap.put(2,new Location(2,"Roshan is on top of hill"));
        locationMap.put(3,new Location(3,"Roshan is inside a house"));
        locationMap.put(4,new Location(4,"Roshan is in a valley,beside a stream"));
        locationMap.put(5,new Location(5,"Roshan is in a Forest"));

        locationMap.get(1).addExit("W",2);
        locationMap.get(1).addExit("E",3);
        locationMap.get(1).addExit("S",4);
        locationMap.get(1).addExit("N",5);
//        locationMap.get(1).addExit("Quit",0);


        locationMap.get(2).addExit("N",5);
//        locationMap.get(2).addExit("Quit",0);

        locationMap.get(3).addExit("W",1);
//        locationMap.get(3).addExit("Quit",0);

        locationMap.get(4).addExit("N",1);
        locationMap.get(4).addExit("W",2);
//        locationMap.get(4).addExit("Quit",0);

        locationMap.get(5).addExit("W",2);
        locationMap.get(5).addExit("S",1);
//        locationMap.get(5).addExit("Quit",0);

        Map<String,String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT","Quit");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");



        int loc = 1;
        while(true){
            System.out.println(locationMap.get(loc).getDescription());
            if(loc == 0){
                break;
            }
           // System.out.print("Please , Enter location key : ");
            Map<String,Integer> exists = locationMap.get(loc).getExits();
            System.out.println("Available Exists are ");
            for(String exit : exists.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exists.containsKey(direction)){
                loc = exists.get(direction);
            }else{
                System.out.println("You cannot go in that direction");
            }
        }

        //Use of String class split() functions with given deimiter
        String[] road = "My Adventure game is made by Roshan".split(" ");//space is a delimiter
        for(String i : road){
            System.out.println(i);
        }

        System.out.println("*********************************************");

        String[] build = "Roshan , raut, is on a road".split(", ");
        for(String i:build){
            System.out.println(i);
        }
    }

    /*
    Output:
    Roshan stands at Road in front of building
    Available Exists are
    Quit, S, E, N, W,
    s
    Roshan is in a valley,beside a stream
    Available Exists are
    Quit, N, W,
    n
    Roshan stands at Road in front of building
    Available Exists are
    Quit, S, E, N, W,
    north
    Roshan is in a Forest
    Available Exists are
    Quit, S, W,
    south
    Roshan stands at Road in front of building
    Available Exists are
    Quit, S, E, N, W,
    i have to go west now
    You cannot go in that direction
    Roshan stands at Road in front of building
    Available Exists are
    Quit, S, E, N, W,
    now i have to go west
    You cannot go in that direction
    Roshan stands at Road in front of building
    Available Exists are
    Quit, S, E, N, W,
    north now
    Roshan is in a Forest
    Available Exists are
    Quit, S, W,
    i really have to quit this game
    Roshan Sits and learns Java
    My
    Adventure
    game
    is
    made
    by
    Roshan
    *********************************************
    Roshan
    raut
    is on a road

    Process finished with exit code 0


     */
}

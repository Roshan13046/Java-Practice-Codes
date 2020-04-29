package com.roshanraut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsMain {
    public static void main(String[] args) {
        Set<Integer>squares = new HashSet<>();
        Set<Integer>cubes = new HashSet<>();

        for(int i=1;i<= 100 ;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are "+squares.size()+" squares and "+cubes.size()+" cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains "+union.size()+" elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains "+intersection.size()+" elements.");
        for(int i : intersection){
            System.out.println(i +" is the square of "+Math.sqrt(i)+" and the cube of "+Math.cbrt(i));
        }


        Set<String> words = new HashSet<>();
        String sentence = "My Name is Roshan Prakash Raut";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        //Assymetric Differences :elements appear in one set but not in the other
        //Symmetric Difference :: eleemnts appear in one set or the other but not both. ie : union - intersection
        Set<String> fruits = new HashSet<>();
        Set<String > divine = new HashSet<>();
        String[] fruitThoughts = {"An" , "Apple","a","Day","Keeps","Doctor","Away"};
        fruits.addAll(Arrays.asList(fruitThoughts));

        String[] divineThoughts = {"to","err","is","a", "human","to","forgive","divine"};
        divine.addAll(Arrays.asList(divineThoughts));

        System.out.println("fruits - divine : ");
        Set<String> diff1 = new HashSet<>(fruits);
        diff1.retainAll(divine);
        printSet(diff1);

        System.out.println("divine - fruits : ");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(fruits);
        printSet(diff2);

        //Symmetric difference : union - intersection
        Set<String> unionTest = new HashSet<>(fruits);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(fruits);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference : ");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //Contains all method in set to check subset or superset
        if(fruits.containsAll(divine)){
            System.out.println("divine is subset of fruits");
        }

        if(divine.containsAll(intersectionTest)){
            System.out.println("intersection is subset of divine");
        }

    }

        private static void printSet(Set<String> set){
            System.out.print("\t");
            for(String s : set){
                System.out.print(s + " ");
            }
            System.out.println();
        }
}

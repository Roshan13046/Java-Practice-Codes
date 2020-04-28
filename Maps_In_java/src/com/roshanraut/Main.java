package com.roshanraut;

import java.util.HashMap;
import java.util.Map;

public class Main {
//Maps are not exactly part of Collections.
// A particular key has a particular data and it doesnot guarantee that objects will be stored in particular order
//  if for same key ,a new data is written
// the data gets overwritten on that key again.

    public static void main(String[] args) {
	    Map<String,String> fruitLovers = new HashMap<>();
	    fruitLovers.put("apple","Bill Gates");
	    fruitLovers.put("mango","Roshan ");
	    fruitLovers.put("banana","Jeff Bejoz");
	    fruitLovers.put("chickoo","Marks Zukerberrg");

        System.out.println(fruitLovers.get("apple"));
        System.out.println(fruitLovers.get("mango"));
		System.out.println(fruitLovers.get("banana"));

//********************************* Note: imp concepts *************************************
		System.out.println(fruitLovers.put("grape","Asha"));//if value is added for first time it will return null
		System.out.println(fruitLovers.put("grape","Shubham"));//if value is overwritten for second time then it return previous key data
		System.out.println(fruitLovers.get("grape"));//it will print updated key data
		
		//way to check if the key is already present or not
		if(fruitLovers.containsKey("papaya")){
			System.out.println("Papaya is already in the map");
		}else{
			fruitLovers.put("papaya","Roshan");
		}

		System.out.println("**************** Printing Maps  data*********");
		for(String key : fruitLovers.keySet()){
			System.out.println(key +" : "+fruitLovers.get(key));
		}

		System.out.println("\n******************remove() method in Maps **************");
		//remove method in map
		if(fruitLovers.remove("apple","Bill Gates")){
			System.out.println("apple removed successfully");
		}else{
			System.out.println("apple not removed , key value pair not found ");
		}

		System.out.println("\n*****************replace() method in java********************");
		System.out.println(fruitLovers.replace("mango","Lalaaan"));//Note:it prints previous key data ie: Roshan

		//Note: another type of replace method :  replace(key,oldData,NewData);
		if(fruitLovers.replace("banana","Jeff Bejoz","Prakash")){
			System.out.println("banana key data replaced successfully");
		}else{
			System.out.println("key banana is absent so not replaced with new data");
		}

    }
}

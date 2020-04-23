package com.roshanraut;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//CHALLENGE:
		Player roshan = new Player("Roshan",95,9);
		System.out.println(roshan.toString());
		saveObject(roshan);

		roshan.setHitPoints(0);
		System.out.println(roshan);
		roshan.setWeapon("Rocket -->>>> Launcher");
		saveObject(roshan);
		loadObject(roshan);
		System.out.println(roshan);

		ISaveable mySelf = new Monster("xyz",2,4);
		//Note:: typeCasting of object of type ISaveable to Monster type
		System.out.println("Strength : "+((Monster)mySelf).getStrength());//Note :typeCasting myself object to Monster class
		System.out.println(mySelf);
		saveObject(mySelf);


		//mySelf.getStrength();//Error myself is having ISaveable class type so need to typecast myself to Monster class type
		// is valid if
		Monster myelf = new Monster("xyz",2,4);
		myelf.getStrength();




    }

    public static ArrayList<String >readValues(){
    	ArrayList<String> values = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index =0;
		System.out.println("Choice : \n"+"0 to quit\n"+"1 to enter a String");

		while(!quit) {
			System.out.println("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
				case 0:
					quit = true;
					break;
				case 1:
					System.out.println("Enter a String : ");
					String stringInput = scanner.nextLine();
					values.add(index,stringInput);
					index++;
					break;
			}
		}
		return values;
	}

	public static void saveObject(ISaveable objectToSave){
    	for(int i=0;i < objectToSave.write().size();i++){
			System.out.println("String "+objectToSave.write().get(i)+" to storage device");
		}
	}

	public static void loadObject(ISaveable objectToLoad){
    	ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}

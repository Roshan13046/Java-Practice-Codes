package com.roshan;
//Challenge :


//Crete a simple interface  that interface allows an object to be saved to some of
// storage medium.
/*The exact type of medium is not known to the interface (nor to the class that
 implements it)...............................
The interface will just specify two methods ,one to return an ArrayList of values
 to be saved
and the other to populate the object's fields an arrayList(parameter).
Create a few sample classes that implements your saveable interface (we have used
 the idea of a game)
with Players and Monsters ,but you can create any type of classes that you want
Override the toString() method for each of your classes so that they can be easily printed to enable the
program to be tested asily.
In main ,write a method that  takes an object that implements the interfaces as a parameter and
"saves" the values eg: calls the method defined in the interface.
We havent covered I/O yet,to your method should just print the values to the screen
Also in the Main class,Write a method that restores the values to a saveable object.
Eg: calls the method from the interface for populating fields (see above)
Again ,We are not going to use java file I/O; Instead use the readValues() method below to simulate getting values from a file
this allows you to type as many values as your class requires ,and returns arraylist
There is a whole java I/O section later in the course where you will use file handling

 */


import java.util.List;

public interface ISaveable {
    List<String > write();
    void read(List<String> readValues);
}

package com.roshan;
/*
fOR THIS CHALLENGE Create an abstract class to define items that can be stored in a list.
The class should contain 2 reference for items which will represent the next and previous item list the
case of a linked list .
ie : if you call your abstract class listItem ,then it would have two mwmber variable of type Listitem
that will hold reference to the next and previous Listitem.
The abstract class will also need to hold a value  - try to be as flexible as possible
when defining the type of the value.
the class will also need methods to move to the next item and back to the previous item
and mmethods to set the next and previous item
You should also specify a comparable mthod that takes a paramater of th same type
as the class and return 0 if the values are equal.greater than Zero if the value sorts greater than the parameter
and less than the 0 if it sorts less than the parameter.

Create a concrete class from your abstract List item class and use this in a linklist
class to implement linkList that will add items in order So that they are sorted alphabetically
Duplicates are not added.
Note that your own linkList class here,not using built-in-list

Rules for adding Item in linkList are
if the head of the list is null ,make the head refer to the item to be added.
if the item to be added is less than the current item in the list,add the item before
the current item .
if the item to be added is greater than the curent item ,move onto the next item and compare
again if there is an next item then that is where the new item belongs.
Care will be nedded when insertinf before the first item in the list it will not have a previous item
You will also need a methood to remove an item from the list.
Hint : if you are creating classes with names such as list ,linkList,node etc,make sure that
you create your classes before refering to that .In previous videos we have often refered to classes that we create
later,but if you use names that Intellij recognises as java classes it will lead to problems later.

Optinal:create a class to use your concrete class to implement a binary search tree.
When addig items in a binary seach tree,if he item to be added is less than the current item
then move to the left and viceversa
the new item is added when an attempt to move in the required direction would involve following a null reference
once again ,dupllicates are not allowed.

Hint : to avoid typing loas of "addition" lines,split a string into an array and create your list in loop as in the ex below.
String stringData = "abc def ghi jkl";
String[] data = stringData.split(" ");  //split functionn with " "as delimiter.
for(String s : data){
}
*/



public class Main {

    public static void main(String[] args) {
	    MyLinkList myLinkList = new MyLinkList(null);
        myLinkList.traverse(myLinkList.getRoot());


        String stringData = "0 1 2 3 4 5 6 7 8 9 ";
        String[] data = stringData.split(" ");  //split functionn with " "as delimiter.
        for(String s : data){
            myLinkList.addItem(new Node(s));
        }
       // myLinkList.traverse(myLinkList.getRoot());
        myLinkList.removeItem(new Node("0"));
        myLinkList.traverse(myLinkList.getRoot());

       // myLinkList.traverse(myLinkList.getRoot());
        myLinkList.removeItem(new Node("3"));
        myLinkList.traverse(myLinkList.getRoot());

        //myLinkList.traverse(myLinkList.getRoot());
        myLinkList.removeItem(new Node("9"));
        myLinkList.traverse(myLinkList.getRoot());

    }
}

package com.roshan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> memberLinkedList = new LinkedList<String>();
/*
        memberLinkedList.add("Prakash");
        memberLinkedList.add("Kiran");
        memberLinkedList.add("Roshan");
        memberLinkedList.add("Shubham");

        printMemberList(memberLinkedList);

        memberLinkedList.add(2,"Asha");
        printMemberList(memberLinkedList);

        memberLinkedList.remove(2);
        printMemberList(memberLinkedList);
 */
        addInorder(memberLinkedList,"Prakash");
        addInorder(memberLinkedList,"Kiran");
        addInorder(memberLinkedList,"Asha");
        addInorder(memberLinkedList,"Roshan");
        addInorder(memberLinkedList,"Shubham");

        printMemberList(memberLinkedList);
        addInorder(memberLinkedList,"Aash");
        printMemberList(memberLinkedList);


        visit(memberLinkedList);
    }

    public  static void printMemberList(LinkedList<String> memberLinkedList){
        Iterator<String> i = memberLinkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Member  : " + i.next());
        }
        System.out.println("=========================================");
    }

    private static  boolean addInorder(LinkedList<String> linkedList , String member){
        ListIterator<String> i = linkedList.listIterator();
        //Iterator<String> j = linkedList.iterator();
        while(i.hasNext()){
            int compare = i.next().compareTo(member);
            if(compare == 0){
                //equal , do not add
                System.out.println(member + " is already included as a member");
                return false;
            }else if(compare > 0){
                //new Member should appear before this one
                i.previous();
                i.add(member);
                return true;
            }else{
                //move on to next member
            }
        }
        i.add(member);
        return true;
    }

    private static void visit(LinkedList members){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> i = members.listIterator();

        if(members.getFirst() == ""){
            System.out.println("No members in the iterators");
        }else{
            System.out.println("Now Visiting "+i.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday Vacations over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(i.hasNext()){
                            i.next();
                        }
                        goingForward = true ;
                    }
                    if(i.hasNext()){
                        System.out.println("Now Visiting "+i.next());
                    }else{
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        goingForward = false;
                    }
                    if(i.hasPrevious()){
                        System.out.println("Now Visiting "+i.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions: \n press ");
        System.out.println("0 - to quit\n" +
                "1 - go to next member \n"+
                "2 - go to previous member\n"+
                "3 - print menu option ");
    }

}

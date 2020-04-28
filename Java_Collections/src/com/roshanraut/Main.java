package com.roshanraut;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Anuradha Talkies",8,12);
         theatre.getSeats();
        if(theatre.reserveSeat("H11")){
            System.out.println("Please Buy");
        }else{
            System.out.println("Sorry , seat is Taken");
        }
        if(theatre.reserveSeat("H11")){
            System.out.println("Please Buy");
        }else{
            System.out.println("Sorry , seat is Taken");
        }

        //Learning Binary Search and it's testing
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); //Shallow Copy
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else{
            System.out.println("Seat already reserved");
        }

        //Reverse printing of seatCopy ie temp List variable
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);
        Collections.reverse(seatCopy);
        System.out.println("Printing reverse Order seatCopy : ");
        printList(seatCopy);


        //Printing shuffled or Random order
        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffle Order of seatCopy : ");
        printList(seatCopy);

        //min and max elemnt in COllection
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min Seat number is : "+ minSeat.getSeatNumber());
        System.out.println("Max Seat number is : "+maxSeat.getSeatNumber());


        //Comparators function overrided testing
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);//NOTE:Syntax call Comparator function
        System.out.println("Sorted seats by prices : ");
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("*********************************************");
    }






}

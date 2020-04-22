package com.roshan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Batsman dhoni = new Batsman("Dhoni");
	    Baller ashwin = new Baller("Ashwin");
	    WicketKeeper dk = new WicketKeeper("DK");
	    Fielder kohli = new Fielder("Kohli");
	    Fielder dhawan = new Fielder("Dhawan");
	    Fielder raina = new Fielder("Raina");

/* WITHOUT GENERICS
	    Team india = new Team("India");
	    india.addPlayer(dhoni);
	    india.addPlayer(ashwin);
	    india.addPlayer(dk);
	    india.addPlayer(kohli);
	    india.addPlayer(dhawan);
	    india.addPlayer(raina);
*/
		Team<Batsman> batsmanTeam = new Team<>("India : BatsManTeam");
		batsmanTeam.addPlayer(dhoni);
		System.out.println("No of Bats-Man : "+batsmanTeam.teamSize());

		Team<Baller> ballerTeam = new Team<>("India : BallerTeam");
		ballerTeam.addPlayer(ashwin);
		System.out.println("No of Ballers : "+ballerTeam.teamSize());

		Team<WicketKeeper> wkTeam = new Team<>("India : WK Team");
		wkTeam.addPlayer(dk);
		System.out.println("No of keppers : "+wkTeam.teamSize());

		Team<Fielder> fielderTeam1 = new Team<>("India : FielderTeam1");
		fielderTeam1.addPlayer(kohli);
		fielderTeam1.addPlayer(dhawan);

		Team<Fielder> fielderTeam2 = new Team<>("India : FielderTeam2");
		fielderTeam2.addPlayer(raina);
		System.out.println("No of Fielders : "+ fielderTeam2.teamSize());


		fielderTeam1.matchResult(fielderTeam2,98,100);
		//batsmanTeam.matchResult(ballerTeam,99,200);

		System.out.println("Rankings : ");
		System.out.println(fielderTeam1.getTeamName() + " : "+fielderTeam1.ranking());
		System.out.println(fielderTeam2.getTeamName() + " : "+fielderTeam2.ranking());

		System.out.println(fielderTeam1.compareTo(fielderTeam2));
		System.out.println(fielderTeam2.compareTo(fielderTeam1));
		System.out.println(fielderTeam1.compareTo(fielderTeam1));
		System.out.println(fielderTeam2.compareTo(fielderTeam2));

		/* Inbuilt Collection to Sort ArayList
		ArrayList<Team> team = new ArrayList<>();
		Collections.sort(team);

		End */
    }
}

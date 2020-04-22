package com.roshan;
/*
*ArrayList<Team> teams;
* Collections.sort(teams);
* Create a generic classs to implement a league table for a sport.
* The class should allow teams to be added to the list,and store a list of teams that belongs to the league.
* Your class should have a method to print out the teams in order with the teams at the top of the league printed first.
* only teams of the same type should be added to any particular instance of the league
* class - the program should fail to compile if an attempt is made to add an incompatiable team.
 */

public class Main {

    public static void main(String[] args) {
	    League<Team<CricketPlayer>>  ipl = new League<>("IPL-2020");
	    Team<CricketPlayer> chennai = new Team<>("CSK");
	    Team<CricketPlayer> mumbai = new Team<>("MI");
	    Team<CricketPlayer> hyderabad = new Team<>("SRH");
	    Team<CricketPlayer> punjab = new Team<>("KXII Punjab");

	    ipl.addTeam(chennai);
	    ipl.addTeam(mumbai);
	    ipl.addTeam(hyderabad);
	    ipl.addTeam(punjab);

		chennai.matchResult(mumbai,100,90);
		mumbai.matchResult(punjab,99,97);
		hyderabad.matchResult(mumbai,99,93);
		hyderabad.matchResult(chennai,99,98);
		punjab.matchResult(mumbai,95,97);
		chennai.matchResult(punjab,99,96);

        ipl.leagueTable();
    }
}

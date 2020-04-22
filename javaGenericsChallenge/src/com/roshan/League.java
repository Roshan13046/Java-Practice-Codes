package com.roshan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League <T extends  Team> {
    private String leagueName;
    private ArrayList<T> league = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void leagueTable(){
        Collections.sort(league);//we have compareto fun in Team class
        for(T t:league){
            System.out.println(t.getTeamName()+" : "+t.ranking());
        }
    }
}

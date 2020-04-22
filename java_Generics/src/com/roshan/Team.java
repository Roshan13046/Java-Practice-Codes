package com.roshan;

import java.util.ArrayList;
//You can extend only one class but can implement multiple Interfaces.
//Syntax : public class Team< T extends Player implements Inteface1 & Interface2 & inteface3 >

public class Team<T extends  Player> implements Comparable<Team<T>> {
    private String teamName;
    int won=0,loss=0,ties=0;
    private ArrayList<T> members = new ArrayList<>();


    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already in Team");
            return true;
        }else{
            members.add(player);
            System.out.println(player.getName()+" added in Team "+this.teamName);
            return true;
        }
    }

    public int teamSize(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent,int ourScore,int theirScore){
        String message;
        if(ourScore == theirScore){
            message = " drew to ";
            ties++;
        }else if(ourScore > theirScore){
            message = " won to ";
            won++;
        }else{
            message = " loose to ";
            loss++;
        }
        if(opponent != null){
            //also updating the results of opponent team
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won*28 + ties);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}

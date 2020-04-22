package com.roshan;
/*Create a program that implement a playList for songs.
Create a song class having title and Duration for a song.
The program will have an album Class containing a list of songs.
The albums will be storde in ArrayList.
Songs from different albums can be added to the playList and will appear to the list in the order they are added.
Once the songs have been added to the playList,Create a menu Of options to.
Quit,skip forward to the next song.skip backwards to a previous song.Replay the current song
List the songs in the playList
A song must exist in an album before,it can be added to the playList(so you can only play songs that you quit).
Hint: To replay a song ,Consider what happened when we went back and forth from a city before we started
tracking the direction we were going.
As a optional extra,provide an option to remove the current song from the playlist
Hint: listIterator.remove();

 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Albums {
    private String albumName;
    private String artist;
    private ArrayList<Songs> songs ;

    public Albums(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Songs>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            this.songs.add(new Songs(title,duration));
            return true;
        }
        return false;
    }

    private Songs findSong(String title){
        for(Songs checkedSong: this.songs ){ // for each
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber ,LinkedList<Songs> playList){
        int index = trackNumber -1 ;
        if(index >=0 && index <=this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println(" This album does not have a track "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Songs> playList){
        Songs checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
        }
        System.out.println("The song "+ title + " is not in this album ");
        return false;
    }


    /***********************Challenge INNER CLASS ************
    //Chalenge oof Inner CLass
    private class SongList{
        private ArrayList<Songs> songs;

        public SongList() {
            this.songs =new ArrayList<Songs>();
        }

        public boolean add(Songs song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Songs findSong(String title){
            for(Songs checkedSong: this.songs ){ // for each
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        public Songs findSong(int trackNumber){
            int index = trackNumber ;
            if(index > 0  && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }
    }
     */

}

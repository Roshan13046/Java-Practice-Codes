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


public class Songs {
    private String title;
    private double songDuration;

    public Songs(String title, double songDuration) {
        this.title = title;
        this.songDuration = songDuration;
    }

    public String getTitle() {
        return title;
    }

    public double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return this.title+" : "+this.songDuration;
    }
}

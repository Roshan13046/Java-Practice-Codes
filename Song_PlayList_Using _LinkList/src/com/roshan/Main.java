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


import java.util.*;

public class Main {
    private static ArrayList<Albums> albums = new ArrayList<Albums>();

    public static void main(String[] args) {
        Albums album = new Albums("rama","roshan");
        album.addSong("ganapati",8);
        album.addSong("Hanuman Chalisa",5);
        album.addSong("kkabirDohee",4);
        album.addSong("Sai ram",4);
        albums.add(album);

        album = new Albums("Rocking","A r rehman");
        album.addSong("Vande mataram",2);
        album.addSong("Sare jaha se accha",4);
        album.addSong("Pani pani re",6);
        album.addSong("Sanam teri kasam",5);
        albums.add(album);

        LinkedList<Songs> playList = new LinkedList<Songs>();
        albums.get(0).addToPlayList("ganapati",playList);
        albums.get(0).addToPlayList("Vande mataram",playList);
        albums.get(0).addToPlayList("Sanam teri kasam",playList);
        albums.get(0).addToPlayList(1,playList);
        albums.get(0).addToPlayList(2,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(66,playList);//There is no track this

        play(playList);

    }

    private  static void play(LinkedList<Songs> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Songs> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playList");
            return ;
        }else{
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0 :
                    System.out.println("PlayList Complete");
                    quit = true ;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of playList");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playong "+listIterator.previous().toString());
                    }else{
                        System.out.println("We are at Start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playng "+ listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the List");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward =true ;
                        }else{
                            System.out.println("we have reached end of the List");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case  6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private  static  void printMenu(){
        System.out.println("Available actions :\nPress : ");
        System.out.println(
                "0 - to quit\n"+
                "1 - to play next Song\n"+
                "2 - to play previous Song\n"+
                "3 - to replay the current Song\n"+
                "4 - list songs in the playList\n"+
                "5 - print available actions\n"+
                "6 - remove the Current song  from playList\n");
    }

    private static  void printList(LinkedList<Songs>playList){
        Iterator<Songs> iterator = playList.iterator();
        System.out.println("******************************************");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*********************************************");
    }
}

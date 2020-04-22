package com.roshan;
//COMPOSITION CHALLENGE
public class Main {

    public static void main(String[] args) {
        /*ROOM CHALLENGE:
        Create a single room of a house using composition.Think about the things to be included int the room
        Maybe physical parts of the house and furniture as well
        Add at least one method to access an object via getter and then that objects public method as you saw in previous video .
        and also one method to hide the object completely ie basically access that object using another
        public method as seen in part2 of the video
         */
        /*
        Components of room Cupboards,furnitures,AirConditioners,Electronics..............
        */
        Dimension dimension = new Dimension(120,400,145);
        Cupboard cupboard = new Cupboard(dimension,"Goodrej","Digital password",5000);
        Furniture furniture = new Furniture(2,3,1,2,2);
        Electronics electronics = new Electronics(1,2,1,1,1);
        Members members = new Members(4,2,1,1);

        Room hall = new Room(cupboard,furniture,electronics,members);

        /*
        hall.typeOfRoom();
        hall.getMembers().noOfMembers();
        hall.getCupboard().featuresOfCupboard();
        hall.getFurniture().totalFurnitures();
        hall.getElectronics().totalElectronicGadgets();

        */

         hall.featuresOFRoom();


    }
}

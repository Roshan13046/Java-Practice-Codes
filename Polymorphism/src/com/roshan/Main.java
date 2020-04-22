package com.roshan;

//Base class
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}
//class 1
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    @Override
    public String plot() {
        return "Jaw plot called";
    }
}

//Class 2
class Independence extends Movie{
    public Independence() {
        super("Independence");
    }
    @Override
    public String plot() {
        return "Independence Plot called";
    }
}
//Class 3
class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "MazeRunner Called";
    }
}

//Class 4
class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "StarWars Plot called ";
    }
}
//Class 5
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }

    //No plot Function
}


//main class
public class Main {

    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie = randomMovie();                //randomMovie function called .............................
            System.out.println("Movie # "+ i +", "
                    + movie.getName() + '\n' +
                    "Plot: " + movie.plot() + "\n");
//NOTE:  movie.plot() is masterMind of POLYMORPHISM Concept
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;       //(int )(math.random()*5) is a double return type function and starts from 0 to 4 so added + 1
                                                                // to start from 1 to 5
        System.out.println("Random Movie printed was " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Independence();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}

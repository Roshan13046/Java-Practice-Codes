package com.roshan;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Raja");
	    dog.eat();
	    dog.breathe();

	    /*ERROR
		Bird bird = new Bird("hfd") ;  //you cannot Instantiate abstract class
		bird.breathe();
		bird.eat();
		bird.fly();

		*/

	    Parrot parrot = new Parrot("Black Boak");
	    parrot.fly();
	    parrot.breathe();
		parrot.eat();


		Penguin penguin = new Penguin("Motie ");
		penguin.fly();
		penguin.breathe();

    }
}
/*
Relations types:is_a ; has_a;can etc
eg:Bird is an animal so ( is a relation) use Inheritance rather than Inheritance

eg:Bat or Dragon is an animal and not a bird but it can fly.So using only abstract class will make the design
complicated and unseccessfull so we should use (is-a and can relationship).
Bat is a animal and it can Fly So( class Bat extends Animal implements canFly{
})

*****See Video 130 and 131 for main differennces btw abstract class and interfaces.

 */
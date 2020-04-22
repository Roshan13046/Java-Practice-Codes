package com.roshan;

public class Goat extends Animal {
    private int eyes,legs,teeth,tail,mammaryGlands;
    private String coat;

    public Goat(String name, int size, int weight,int eyes,int legs,int teeth,int tail,int mammaryGlands,String coat ) {
        super(name,1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;
        this.mammaryGlands=mammaryGlands;
    }
    private void chew(){
        System.out.println("Goat Chew's Food");
    }

    @Override
    public void eat() {
        System.out.println("Goat.eat() called");
        this.chew();
        super.eat();
    }

    //overloaded functions of parent class can be overrided
    @Override
    public void eat(int speed) {
        super.eat(speed);
    }
    //overrried functions can be overloaded
    public void eat (int speed1 ,int speed2){
        System.out.println("eating speed ranges :"+speed1 +" and "+speed2);
    }

    private void walk(){
        System.out.println("Goat Walks at speed of : ");
        super.move(2);
    }

    public void run(){
        System.out.println("Goat.Run() ");
        super.move(8);
    }

    @Override
    public void move(int speed) {
        System.out.println("Goat.move() called");
        this.walk();
        super.move(speed);
    }


    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTeeth() {
        return teeth;
    }

    public int getTail() {
        return tail;
    }

    public int getMammaryGlands() {
        return mammaryGlands;
    }

    public String getCoat() {
        return coat;
    }
    //rules for overloaded methods:also called compile time polymorphism
    //same name but diff no of arguments in same class or different class
    //can have diff return type and access specifier or check/uncheck Exception
    //handlers
    //rules for overriding methods:also called run timr polymorphism /dynamic dispatch
    //as which method to be called is decided at run time
    //RULES:
    //it must have same name and same arguments
    //return type can be a subclass of return type in parent class
    //can't have lower access modifier
    //eg: if parent method is protected then using private is not allowed but
    //using public in the child would be allowed

    /*imp points for overrriding
    1)only inherited methods can be ovriden and that only in the child classess
    2)Constructors and private methods cannot be overrriden
    3)Methods that are final cannot be overriden
    4)A subclass can use super.methodName() to call the sperClass overriden methods
    5)@overriden statement should be written before the overiding methods
    because it points user if overriding rules are voilated.
     */


//DIFFERENCE
    /*method overloading:
    1)provides functionality to reuse a  method name with different functionality
    2)usually in a single class but may also be used in  a child class
    3)Must have different parameters
    4)May have different return types
    5)May have different access modifiers (public ,private,protected)
    6)may throw different exceptions

    //Method overriding
    1)Used to Override a behaviour which the class has inherited from the parent class
    2)Always in two classes have a child-parent or IS-A relationship
    3)Must have same name and same parametes
    4)Must have same return type or covariant return type(Child class)
    5)Must NOT have lower modifiers(protected to private) but may have higher
     access modifier(protected to public)
    6)Must not throw a new or Broader checked exceptions

     */
    /*
    STATIC METHODS:
    A method is declared as static if donot uses any instance variables.
    Static methods are called as ClassName.methodName();
    or methodName(); only id in the same class
    eg:
    Class Calculator{
        public static void printSum(int x ,int y){
        System.out.println("Sum : "+(x+y));
        }
    }

    main class{
    Calculator.printSum(5,10);//static methods are called using className

    printHello();/main.printHello();//methods is in same class

    public static void printHello(){
        System.out.println(" Hello world ! ");
    }

    main is also a static function it is called by JVM machine


    //INSTANCE METHODS:
    Instance methods can access instance variables and instance methods
    They can also access Static methods too.
    eg:
    Class Calculator{
        public void printSum(int x ,int y){              //NOTE:NO use of static keyword
          System.out.println("Sum : "+(x+y));
        }
    }

    main class{
    Calculator calculator = new Calculator();//first created an instance of class

    calculator.printSum(5,10);//instance method is called using instance variable/object
    printHello();/main.printHello();

    public static void printHello(){
        System.out.println(" Hello world ! ");
    }

    NOTE :When to create static and instance Methods
    if method uses instance variables then create instance methods
    else Create static methods.

     */

}

package com.roshan;



import java.util.Scanner;

/*
Problem stmt:
The purpose of the application is to help a fictitious company Bills Burgers to
manage their process of selling hamburgers.
Our application will help bill to select the type of Burgers,Some of the additional
 items to be added to the burgers and pricing
 We want to create a base hamBurger ,but also two other types of hamburgers that
 are popular ones in bill store
 The basic hamburger should have the following items
 Bread roll type ,meat and upto four additional additions(things like letuuce,carrot,tomato etc
 that the customer can select to be added to the burger.
 Each one of the items gets charged additionlly so you need some way to track
 how may items got added and to calculate the final price (BaseBurgers with all the additionals)
  This Burger has a Base Price and the additional are all separately priced
  (up to four additions see above)
  Create a hamburger Class to deal with all the above
  The Constructor should only include the roll type,meat and price ,can also include
  name of burger oor you can use a setter.
  Also create two extra varieties of hamburger(sub classes)to cater for
  a)Healthy Burger(on a brown rye bread roll),plus two addition items that can be added
  The healthy burger can have six items (Additions in total)
  Hint:
  You probably want to process two additional items in this new class
   (sub class of the hamburger), not the base class (hamburger),since the two additions are
   only appropriate for the new class(in other words new burger types).
   b)Deluxe hamburger - comes with chips and drinks as addition,but no extra additions are
   allowed
   HINT:
   You have to find a way to automatically add these new additions at the time
   the deluxe burger object is created, and then prevent other additions made.
   All 3 classes should have a method that can be called anytime to show the base price
   of the hamburger plus all additionals each showing the addition name ,and addition
   price ,and a grand/final total for the burger (base price + all additions)
   for the other two additional classes this may require you to be looking at the
   base class for pricing and then adding totals to final price........
 */

class HamBurger{
    public static final Scanner  scanner = new Scanner(System.in);

    private String roolType;
    private boolean hasMeat;
    private int price;
    private int totalPrice ;

    public HamBurger(String roolType, boolean hasMeat, int price) {
        this.roolType = roolType;
        this.hasMeat = hasMeat;
        this.price = price;
        this.totalPrice = price;
      //  System.out.println("Hamburger constructor called : "+this.totalPrice);
    }

    public void Additions(){
        System.out.println(" Enter YES/NO ?");//tomato ,letucce,carrot
        this.totalPrice=this.getTotalPrice();
        System.out.println("@ Tomatoes ? ");
        String additions = scanner.nextLine();
        if( additions.equals("YES") ){
            this.totalPrice += 10 ;
        }
        System.out.println("@ Carrots  ? ");
        additions = scanner.nextLine();
        if( additions.equals("YES") ){
            this.totalPrice += 10 ;
        }
        System.out.println("@ Letucce  ? ");
        additions = scanner.nextLine();
        if( additions.equals("YES") ){
            this.totalPrice += 10 ;
        }
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }
}

class HealthyBurger extends HamBurger{
    private int totalPrice = 40;

    public HealthyBurger(String roolType, boolean hasMeat, int Price) {
        super(roolType, hasMeat, Price);
        this.totalPrice = Price;
    }

    @Override
    public void Additions() {

        super.Additions();

        this.totalPrice = super.getTotalPrice();
        String additions;

        System.out.println("@ Mushrooms  ? ");
        additions = scanner.nextLine();
        if( additions.equals("YES") ){
            this.totalPrice += 10 ;
        }

        System.out.println("@ Cheese  ? ");
        additions = scanner.nextLine();
        if( additions.equals("YES") ){
            this.totalPrice += 10 ;
        }
    }

    @Override
    public int getTotalPrice() {
        return totalPrice;
    }
}

class DeluxeBurger extends HamBurger{
    private int totalPrice = 60;

    public DeluxeBurger(String roolType, boolean hasMeat, int Price) {
        super(roolType, hasMeat, Price);
        this.totalPrice = Price;
    }

    @Override
    public void Additions() {
        super.Additions();
        this.totalPrice = super.getTotalPrice();

        String additions;
        System.out.println("@ Chips ? ");
        additions = scanner.nextLine();
        if(additions.equals("YES")){
            this.totalPrice += 20;
        }

        System.out.println("@ Cold Drinks ? ");
        additions = scanner.nextLine();
        if(additions.equals("YES")){
            this.totalPrice = 20;
        }
    }

    public int getTotalCost() {
        return totalPrice;
    }
}

//some problem with totalcost dont adds base burger cost ..............
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int totalCost = 0;
        while(true){

            System.out.print("Please, Enter No of Burger's to Buy : ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int noOfBurgers = scanner.nextInt();
                for (int i = 1; i <= noOfBurgers; i++) {
                    HamBurger hamBurger = Choice();
                    hamBurger.Additions();
                    totalCost += hamBurger.getTotalPrice();
                }
                System.out.println("Total Price : " + totalCost +"\n************* THANK YOU ! VISIT AGAIN ******************");
                break;
            } else {
                System.out.println("INVALID NUMBER ");
            }
            scanner.nextLine();
        }

    }


    public static HamBurger Choice(){

        System.out.print(" *******************************Enter the Choice of Burger *************************************\n             0)Exit \n             1) Hamburger : Rs 20 \n             2) Healthy Burger :Rs 40 \n             3) Deluxe Burger :Rs 60 \n\n ");
        System.out.println("**************************************************************************************************");

        while(true) {
            System.out.print(" CHOICE : ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        return null;
                    case 1:
                        System.out.println("Additions are Tomatoes , Carrots ,Letucce ? ");
                        return new HamBurger("Simple Roll", true, 20);
                    case 2:
                        System.out.println("Additions are Tomatoes , Carrots ,Letucce , Mushrooms , Cheese ? ");
                        return new HealthyBurger("Brown RYE", true, 40);
                    case 3:
                        System.out.println("Additions are Tomatoes , Carrots , Letucce ,Chips , Cold Drinks ? ");
                        return new DeluxeBurger("Brown RYE", true, 60);
                    default:
                        System.out.println(" xxxxxxxxxxxxxxxxxxxxx  Invalid Choice xxxxxxxxxxxxxxxxxxxx\n\n * Enter Valid Choice again ");
                }
            } else {
               System.out.println(" ************ INVALID CHOICE No  **************");
            }
            scanner.nextLine();
        }
    }
}

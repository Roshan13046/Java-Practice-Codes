package com.roshanraut;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private  static  StockList stockList = new StockList(new HashMap<>());

    public static void main(String[] args) {
        StockItem temp  = new StockItem("Bread",20,2);
        stockList.addStock(temp);

        temp = new StockItem("Butter",35,2);
        stockList.addStock(temp);

        temp = new StockItem("Jam",49,1);
        stockList.addStock(temp);

        temp = new StockItem("Curd",20,4);
        stockList.addStock(temp);

        temp = new StockItem("Flour",10,5);
        stockList.addStock(temp);

        temp = new StockItem("Rice",23.5,10);
        stockList.addStock(temp);

        temp = new StockItem("Tea",20.56,4);
        stockList.addStock(temp);

        temp = new StockItem("Juice",60,3);
        stockList.addStock(temp);

        System.out.println(stockList);

        System.out.println("\nItems in Basket : ");
        for(String s:stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket roshanBasket = new Basket("Roshan");
        sellItem(roshanBasket,"Car",3);
        System.out.println(roshanBasket);

        sellItem(roshanBasket,"Bread",2);
        System.out.println(roshanBasket);

        sellItem(roshanBasket,"Jam",5);
        sellItem(roshanBasket,"Tea",3);
        sellItem(roshanBasket,"Juice",3);
        sellItem(roshanBasket,"Vegetables",3);
        System.out.println(roshanBasket);

        //Exception concept
//        temp = new StockItem("Gems",14.23);
//        stockList.Items().put(temp.getName(),temp);//Gives unsupported Operation Exception

        //Some other soncepts
        stockList.Items().get("Gems").adjustStock(3000);
        stockList.get("Gems").adjustStock(-3000);//Shows NullPointer Exception as sstockList dont have this meths;
        System.out.println(stockList);

        //Unmodifiable maps
        for(Map.Entry<String,Double>price : stockList.PrintList().entrySet()){
            System.out.println(price.getKey()+" costs "+price.getValue());
        }

    }

    public static int sellItem(Basket basket,String item,int quantity){
        //retrive the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println(" We don't sell "+item);
            return 0;
        }
        if(stockList.sellStock(item,quantity) != 0){
            basket.addToBasket(stockItem , quantity);
            return quantity;
        }
        return 0;
    }
}

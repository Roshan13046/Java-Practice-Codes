package com.roshanraut;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String , StockItem> list;

    public StockList(Map<String, StockItem> list) {
        this.list = new LinkedHashMap<>();//For Alphabetical order we used LinkedHashMap instead of HashMap
    }

    public int addStock(StockItem item){
        if(item != null){
            //check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(),item);
            //if there are already stocks on this item, adjust the quantity
            if(inStock != item){
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(),item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item ,int quantity){
        StockItem inStock = list.getOrDefault(item,null);

        if(inStock != null  && (inStock.quantityInStock() >= quantity) && (quantity>0)){
            inStock.adjustStock((-quantity));
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, Double> PrintList(){
        Map<String,Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String,StockItem> item :list.entrySet() ){
            prices.put(item.getKey(),item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String , StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s= "\nStock Lsit\n";
        double totalCost = 0.0;
        for(Map.Entry<String,StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
            s = s + stockItem+ " ,There are "+stockItem.quantityInStock()+" in Stock, Value of Items : ";
            s = s +String.format("%.2f",itemValue)+"\n";
            totalCost += itemValue ;
        }
        return s+"Total stack value "+ totalCost;
    }
}


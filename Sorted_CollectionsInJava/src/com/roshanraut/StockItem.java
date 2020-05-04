package com.roshanraut;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStack = 0; // can be initialised later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStack = 0;//or here but can't do both
    }

    public StockItem(String name, double price, int quantityStack) {
        this.name = name;
        this.price = price;
        this.quantityStack = quantityStack;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStack;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStack + quantity ;
        if(newQuantity >=0){
            this.quantityStack = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering Stock Items.equal");
        if(obj == this){
            return true;
        }
        if(obj == null || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((StockItem)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem stockItem) {
        System.out.println("Entering stockItem.ComapreTo");
        if(this == stockItem){
            return 0;
        }
        if(stockItem != null){
            return this.name.compareTo(stockItem.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name +" : price "+this.price;
    }
}

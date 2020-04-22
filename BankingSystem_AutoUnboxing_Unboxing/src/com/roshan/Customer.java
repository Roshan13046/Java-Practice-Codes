package com.roshan;

import java.util.ArrayList;
/*
	Your job iis to create a simple Banking Apllication.

	There should be a bank class
	It should have an arrayList of Branches
	Each Branch should have an ArrayList of Customers
	The Customer class should have an array list of Doubles(transactions)
	Customers :
	Name , add the Arraylist of doubles
	Branch :
	Need to be able to add a new customer and initial transaction amount.
	Also needs to add additional transactions for that Customer/branch
	Bank:
	Add a new branch
	Add a customer to that branch with initial transaction
	Add a transction for an existing Customer for that branch
	Show a list of Customers for a particular branch and optionally a list of their transactions
	Demonstration autoboxing and unBoxing in your code
	Hint : Transactions
	Add data validation: whether the customer is present in branch of that bank
	eg: Check if exists or does not exists,etc.
	Think about where you are adding the code to perform certain actions........
	 */
public class Customer {
    private String customerName;
    private ArrayList<Double> transacionsList ;

    public Customer(String customerName, ArrayList<Double> transacionsList) {
        this.customerName = customerName;
        this.transacionsList = transacionsList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransacionsList() {
        return transacionsList;
    }

    public void addTransaction(double transactionAmt){
        this.transacionsList.add(Double.valueOf(transactionAmt));
    }
}

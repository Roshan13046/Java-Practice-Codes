package com.roshan;

import java.util.ArrayList;
import java.util.Scanner;

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

public class Branch {

    private static Scanner scanner = new Scanner(System.in);
    private String branchName;
    private ArrayList<Customer> customerList ;

    public Branch(String branchName, ArrayList<Customer> customerList) {
        this.branchName = branchName;
        this.customerList = customerList;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public boolean addCustomer (){

        System.out.print("Enter New Customer Name :");
        String name = scanner.nextLine();
        if(searchIfExists(name) != -1){
            System.out.println("The Customer already Exists. ");
            return false;
        }

        System.out.print("Enter initial Transaction amount : ");
        double initialTransaction = scanner.nextDouble();
        scanner.nextLine();

        Customer customer = new Customer(name, new ArrayList<Double>());
        customer.addTransaction(initialTransaction);
        customerList.add(customer);
        return true;
    }

    public boolean addCustomerTrasaction(){
        System.out.print("Enter Customer Name : ");
        String name = scanner.nextLine();


        if(searchIfExists(name) == -1){
            System.out.println("The Customer is Not Having Account . ");
            return false;
        }
        System.out.print("Enter Transaction Amount : ");
        double transactionAmt = scanner.nextDouble();
        scanner.nextLine();

        customerList.get(searchIfExists(name)).addTransaction(transactionAmt);
        return true;
    }

    public int searchIfExists(String name){
        for(int i = 0 ; i<this.customerList.size();i++){
            if(this.customerList.get(i).getCustomerName().equals(name)){
                return i ;
            }
        }
        return -1;
    }
}

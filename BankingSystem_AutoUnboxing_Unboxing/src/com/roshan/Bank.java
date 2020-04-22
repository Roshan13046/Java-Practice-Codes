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
public class Bank {
    private String bankName ;
    private   ArrayList<Branch> branchArrayList ;
    private static Scanner scanner = new Scanner(System.in);

    public Bank(String bankName, ArrayList<Branch> branchArrayList) {
        this.bankName = bankName;
        this.branchArrayList = branchArrayList;
    }

    public boolean addNewBranch(){
        System.out.print("Enter new Branch Name of "+ bankName +" : " );
        String branchName = scanner.nextLine();
        if(ifBranchExists(branchName) != -1){
            System.out.println("Branch Already in Existing ");
            return false;
        }
        Branch branch = new Branch(branchName,new ArrayList<Customer>());
        branchArrayList.add(branch);
        return true;
    }

    public int ifBranchExists(String branchName){
        for(int i=0 ;i <branchArrayList.size();i++){
            if(branchArrayList.get(i).getBranchName().equals(branchName)){
                return i;
            }
        }
        return -1;
    }

    public void addNewCustomer(){
        System.out.print("Enter Branch Name :");
        String branchName = scanner.nextLine();
        if(ifBranchExists(branchName) != -1){
            if(branchArrayList.get(ifBranchExists(branchName)).addCustomer()){
                System.out.println("Customer added successfully.");
            }
        }else{
             System.out.println("Branch "+branchName+" does not Exists. ");
        }
    }

    public void addTransaction(){
        System.out.print("Enter Branch Name : ");
        String branchName = scanner.nextLine();
        if(ifBranchExists(branchName) != -1){
            if(branchArrayList.get(ifBranchExists(branchName)).addCustomerTrasaction()){
                System.out.println("Transaction done successfully .");
            }
        }else{
            System.out.println("Branch "+branchName+" does not Exists. ");
        }
    }

    public void showCustomerList(){
        System.out.print("Enter Branch Name of "+ this.bankName +" : ");
        String branchName = scanner.nextLine();
        if(ifBranchExists(branchName) != -1){
           ArrayList<Customer> customerArrayList =  branchArrayList.get(ifBranchExists(branchName)).getCustomerList();
           for(int i=0;i<customerArrayList.size();i++){
               System.out.println("Customer "+(i+1) + " Name : "+ customerArrayList.get(i).getCustomerName());
           }
        }else{
            System.out.println(" Branch does not Exist.");
        }
    }

    public void showCustomerTransactionList(){
        System.out.print("Enter Branch Name of "+ this.bankName +" : ");
        String branchName = scanner.nextLine();
        if(ifBranchExists(branchName) != -1){
            ArrayList<Customer> customerArrayList =  branchArrayList.get(ifBranchExists(branchName)).getCustomerList();
            System.out.print("Enter Customer Name : ");
            String customerName = scanner.nextLine();

            for(int i=0;i<customerArrayList.size();i++){
                if(customerArrayList.get(i).getCustomerName().equals(customerName)) {
                    ArrayList<Double> transactionList = customerArrayList.get(i).getTransacionsList();
                    System.out.println("\nToatal "+transactionList.size() + " Transactions of Customer "+customerName +" : \n");
                    for(int j=0 ;j<transactionList.size();j++){
                        System.out.println("Transaction "+(j+1)+" : Rs = "+ transactionList.get(j).doubleValue());
                    }
                    return ;
                }
            }
            System.out.println(" Customer does not Exists ");
        }else{
            System.out.println(" Branch does not Exist.");
        }
    }
}

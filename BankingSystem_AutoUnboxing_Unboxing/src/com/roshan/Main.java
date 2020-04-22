package com.roshan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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

        System.out.print("Enter Bank Name : ");
        String bankName = scanner.nextLine();

        Bank bank = new Bank(bankName, new ArrayList<Branch>());

        boolean quit = false;
        printInstruction();
        int choice = 0;

        while (!quit) {
            System.out.print("Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    bank.addNewBranch();
                    break;
                case 2:
                    bank.addNewCustomer();
                    break;
                case 3:
                    bank.addTransaction();
                    break;
                case 4:
                    bank.showCustomerList();
                    break;
                case 5:
                    bank.showCustomerTransactionList();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\n Press");
        System.out.println("\t0- To print Choice options.");
        System.out.println("\t1- To Add New Branch.");
        System.out.println("\t2- To Add New Customer.");
        System.out.println("\t3- To Add Transaction.");
        System.out.println("\t4- To Show Customer List.");
        System.out.println("\t5- To Show Customer Transaction List.");
        System.out.println("\t6- To Exit from the Application.");
    }
}

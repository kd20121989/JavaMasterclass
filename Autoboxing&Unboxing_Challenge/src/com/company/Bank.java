package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for (int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        System.out.println("Branch with name: "+branchName+" already existing.\nOperation canceled.");
        return false;
    }

    public boolean addCustomerToBranch(String branchName, String newCustomerName, double initialBalance) {
        Branch existingBranch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            return existingBranch.addNewCustomer(newCustomerName, initialBalance);
        }
        return false;
    }

    public boolean makeTransactionForCustomerOfBranch(String branchName, String customerName, double transactionAmount) {
        Branch existingBranch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            return existingBranch.makeTransaction(customerName, transactionAmount);
        }
        return false;
    }

    public boolean showCustomerListOfBranch(String branchName, boolean showTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            System.out.println("Customer details for branch "+existingBranch.getBranchName()+":\n___________________________");
            ArrayList<Customer> branchCustomers = existingBranch.getListOfCustomers();
            for (int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("["+(i+1)+"] Customer: "+branchCustomer.getCustomerName());
                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j=0; j<transactions.size(); j++) {
                        System.out.println("["+(j+1)+"] Amount: "+transactions.get(j)+"$");
                    }
                    System.out.println("___________________________");
                }
            }
            return true;
        }
        return false;
    }
}

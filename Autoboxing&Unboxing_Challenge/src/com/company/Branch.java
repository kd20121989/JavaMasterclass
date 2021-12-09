package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
        System.out.println("Branch "+branchName+" - registration completed.");
    }

    private Customer findCustomer(String customerName) {
        for (int i=0; i<this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addNewCustomer(String customerName, double initialBalance) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName,initialBalance));
            return true;
        }
        System.out.println("Customer with name: "+customerName+" already existing.\nOperation canceled.");
        return false;
    }

    public boolean makeTransaction(String customerName, double transactionAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.newTransaction(transactionAmount);
            return true;
        }
        System.out.println("Error. No customer with name "+customerName);
        return false;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}

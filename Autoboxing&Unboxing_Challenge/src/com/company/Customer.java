package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        System.out.println("Customer "+customerName+" - registration completed.");
        newTransaction(initialAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void newTransaction(double transaction) {
        this.transactions.add(transaction);
        System.out.println(customerName+". Transaction of "+transaction+"$ completed successfully.\n___________________________");
    }
}

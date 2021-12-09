package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("TestBank");

        bank.addNewBranch("Core");

        bank.addCustomerToBranch("Core", "Me", 50.05);
        bank.addCustomerToBranch("Core", "Chukcha", 175.34);
        bank.addCustomerToBranch("Core", "Sam", 220.12);

        bank.addNewBranch("Second");

        bank.addCustomerToBranch("Second", "Bob", 150.54);

        bank.makeTransactionForCustomerOfBranch("Core", "Me", 44.22);
        bank.makeTransactionForCustomerOfBranch("Core", "Me", 12.44);

        bank.makeTransactionForCustomerOfBranch("Core", "Chukcha", 1.65);

        bank.showCustomerListOfBranch("Core", true);
        bank.showCustomerListOfBranch("Second", true);

        bank.addNewBranch("Zero");
        if (!bank.addCustomerToBranch("Zero", "Dude", 5.53)) {
            System.out.println("Error Zero branch not existing.");
        }

        bank.addNewBranch("Core");
        bank.makeTransactionForCustomerOfBranch("Core","Duke",99.99);
        bank.addCustomerToBranch("Core", "Me", 500.55);
    }
}

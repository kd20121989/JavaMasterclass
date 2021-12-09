package com.company;

public class BankAccount {
    String accNumber;
    double balance;
    String name;
    String email;
    String phoneNumber;

    public BankAccount() {
        this("#13",25000.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accNumber, double balance, String name, String email, String phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");
    }

    public void setAccNumber(String number) {
        this.accNumber=number;
    }

    public void setBalance(double bal) {
        this.balance=bal;
    }

    public void setName(String fullname) {
        this.name=fullname;
    }

    public void setEmail(String address) {
        this.email=address;
    }

    public void setPhoneNumber(String phNum) {
        this.phoneNumber=phNum;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance+=deposit;
        System.out.println(deposit + "$ deposited successfully. Current balance = " + balance);
    }

    public void withdrawFunds(double withdraw) {
        if (this.balance<withdraw) {
            System.out.println("Not enough funds on balance. Current balance = " + balance);
        } else {
            this.balance-=withdraw;
            System.out.println(withdraw + "$ withdrawed from balance. Remaining balance = " + balance);
        }
    }
}

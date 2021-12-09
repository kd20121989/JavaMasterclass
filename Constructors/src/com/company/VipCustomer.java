package com.company;

public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public VipCustomer() {
        this("Default name",1000000.00,"default@mail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"noemail@mail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

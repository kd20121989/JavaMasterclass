package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount account = new BankAccount(); //"№541354", 35000.00, "Duke Nukem", "myemail@mail.com", "+911");
//        System.out.println("Account number: "+account.getAccNumber());
//        System.out.println("Current balance: "+account.getBalance());
//        System.out.println("Holder Name: "+account.getName());
//        System.out.println("Email address: "+account.getEmail());
//        System.out.println("Phone number: "+account.getPhoneNumber());
//
//        account.withdrawFunds(50000);
//        account.depositFunds(30000);
//        account.withdrawFunds(50000);
        VipCustomer vipCustomer1 = new VipCustomer("Serious Sam",500,"mail@me");
        System.out.println(vipCustomer1.name);
        System.out.println(vipCustomer1.creditLimit);
        System.out.println(vipCustomer1.email);
        System.out.println("__________________________");
        VipCustomer vipCustomer2 = new VipCustomer("Rich guy",50000.00);
        System.out.println(vipCustomer2.name);
        System.out.println(vipCustomer2.creditLimit);
        System.out.println(vipCustomer2.email);
        System.out.println("__________________________");
        VipCustomer vipCustomer3 = new VipCustomer();
        System.out.println(vipCustomer3.name);
        System.out.println(vipCustomer3.creditLimit);
        System.out.println(vipCustomer3.email);


    }
}

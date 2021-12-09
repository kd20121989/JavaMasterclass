package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Me",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer "+customer.getName()+" is "+customer.getBalance());
        System.out.println("Balance for anotherCustomer "+anotherCustomer.getName()+" is "+anotherCustomer.getBalance());

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(3);
        integers.add(4);

        for (int i=0; i<integers.size(); i++) {
            System.out.println(i+": "+integers.get(i));
        }

        integers.add(1,2);

        for (int i=0; i<integers.size(); i++) {
            System.out.println(i+": "+integers.get(i));
        }
    }
}

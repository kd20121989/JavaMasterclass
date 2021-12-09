package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234567);
        myPhone.powerOn();
        myPhone.callPhone(1234567);
        myPhone.answer();

        myPhone = new MobilePhone(2345678);
        myPhone.callPhone(2345678);
        myPhone.answer();

        System.out.println("________________________");

        myPhone.powerOn();
        myPhone.callPhone(2345678);
        myPhone.answer();
    }
}

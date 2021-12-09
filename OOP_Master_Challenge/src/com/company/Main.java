package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("White","Chicken",1.5);
        HealthyBurger healthyBurger = new HealthyBurger("Tuna",1.8);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Crispy bread","Pork",2);
        hamburger.tomato.add();
        hamburger.cheese.add();
        hamburger.lettuce.add();
        hamburger.onion.add();
        hamburger.olives.add();
        hamburger.getCheck();
        System.out.println("______________________");
        hamburger.olives.remove();
        hamburger.getCheck();
        System.out.println("______________________");
        healthyBurger.tomato.add();
        healthyBurger.olives.add();
        healthyBurger.lettuce.add();
        healthyBurger.egg.add();
        healthyBurger.onion.add();
        healthyBurger.cucumber.add();
        healthyBurger.bacon.add();
        healthyBurger.getCheck();
        System.out.println("______________________");
        healthyBurger.bacon.remove();
        healthyBurger.getCheck();
        System.out.println("______________________");
        deluxeBurger.bacon.add();
        deluxeBurger.getCheck();
    }


}

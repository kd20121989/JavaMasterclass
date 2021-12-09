package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Swordmaster";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnchancedPlayer player = new EnchancedPlayer("Swordmaster","Sword",50);
        System.out.println("Initial health is " + player.getHealth());

        System.out.println("________________________");

        Printer printer = new Printer(80,200,true);
        printer.printPages(-5);
        printer.printPages(360);
        printer.addToner(-10);
        printer.addToner(5);
        printer.refillToner();
        printer.getPrinterInfo();
    }
}

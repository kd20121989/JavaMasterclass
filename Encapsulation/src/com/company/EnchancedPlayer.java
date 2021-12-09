package com.company;

public class EnchancedPlayer {
    private String name, weapon;
    private int hitPoints = 100;

    public EnchancedPlayer(String name, String weapon, int hitPoints) {
        this.name = name;
        this.weapon = weapon;
        this.hitPoints = (0< hitPoints && hitPoints <=100) ? hitPoints :this.hitPoints;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <=0) {
            System.out.println("Player is down");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        calculateScore(true,800,5,100);

        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Master Kai",calculateHighScorePosition(1500));
        displayHighScorePosition("LikeABoss",calculateHighScorePosition(900));
        displayHighScorePosition("Kill La Kill",calculateHighScorePosition(400));
        displayHighScorePosition("Killer",calculateHighScorePosition(50));
        displayHighScorePosition("Bug1000",calculateHighScorePosition(1000));
        displayHighScorePosition("Bug500",calculateHighScorePosition(500));
        displayHighScorePosition("Bug100",calculateHighScorePosition(100));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println("Player " + playersName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        }else if (1000 > score && score >= 500) {
            position = 2;
        }else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
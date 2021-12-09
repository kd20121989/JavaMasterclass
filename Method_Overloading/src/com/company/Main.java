package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        int newScore = calculateScore("SeriousDude",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,-1);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        centimeters = calcFeetAndInchesToCentimeters(100);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }

        System.out.println(getDurationString(119,59));
        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(-50));
        System.out.println(getDurationString(65,9));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (0 <= feet && 0 <= inches && inches <= 12) {
            double centimeters = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid feets or inches parameters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (0 <= inches) {
            double feet = (int) inches / 12;
            double remainingInches = inches%12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        System.out.println("Invalid inches parameter");
        return -1;
    }

    private static String getDurationString(int minutes, int seconds){
        if (0 <= minutes && 0<= seconds && seconds <= 59) {
            int hours = minutes / 60;
            minutes = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "m ";
            if (minutes < 10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }
            return hoursString + minutesString + secondsString;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    private static String getDurationString(int seconds) {
        if (0 <= seconds) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            System.out.println(seconds + " seconds is " + minutes + " minutes and " + seconds + " seconds");
            return getDurationString(minutes, seconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}

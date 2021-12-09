package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (0 <= minutes){
            String minutesString = minutes + " min = ";
//            if (minutes < 10) {
//                minutesString = "0" + minutesString;
//            }
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            days = days % 365;
            String daysString = days + " d";
//            if (days < 10) {
//                daysString = "0" + daysString;
//            }
            String yearsString = years + " y and ";
//            if (years < 10) {
//                yearsString = "0" + yearsString;
//            }
            System.out.println(minutesString + yearsString + daysString);

        } else {
            System.out.println("Invalid Value");
        }
    }
}

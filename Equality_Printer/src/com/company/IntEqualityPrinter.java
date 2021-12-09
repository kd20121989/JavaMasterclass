package com.company;

public class IntEqualityPrinter {
    public static void printEqual(int first, int second, int third){
        if (0 < first && 0 < second && 0 < third) {
            if (first == second && second == third) {
                System.out.println("All numbers are equal");
            } else if (first != second && second != third) {
                System.out.println("All numbers are different");
            } else System.out.println("Neither all are equal or different");
        } else System.out.println("Invalid Value");
    }
}

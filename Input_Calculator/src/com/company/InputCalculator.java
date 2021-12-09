package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long average = 0;

        while (true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                average++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        average = Math.round((double) sum/average);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}

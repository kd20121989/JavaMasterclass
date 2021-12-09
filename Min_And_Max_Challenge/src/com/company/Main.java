package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

            while (true) {
                System.out.println("Enter number:");

                boolean hasNextInt = scanner.hasNextInt();

                if (hasNextInt) {
                    int number = scanner.nextInt();

//                    if (first) {
//                        first = false;
//                        min = number;
//                        max = number;
//                    }

                    if (number < min) {
                        min = number;
                    }

                    if (max < number) {
                        max = number;
                    }
                } else {
                    break;
                }

                scanner.nextLine();
            }


        System.out.println("Minimum number is " + min + " and maximum number is " + max);
        scanner.close();
    }
}

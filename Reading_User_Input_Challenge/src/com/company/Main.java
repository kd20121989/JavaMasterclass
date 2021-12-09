package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

//        while (true) {
        while (counter<10) {
            System.out.println("Enter number #" + (counter+1) + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                counter++;
//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();

        }

        System.out.println(sum);
        scanner.close();
    }
}
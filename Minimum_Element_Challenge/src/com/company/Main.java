package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of integers to read: \r");
        while (!scanner.hasNextInt()) {
            System.out.println("Enter number of integers to read: \r");
            scanner.nextLine();
        }
        int count = scanner.nextInt();
        System.out.println("Minimum integer in array is: "+findMin(readIntegers(count)));
    }

    private static int findMin(int[] array) {
        int min=Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter "+count+" integer values:\r");
        int[] array = new int[count];
        for (int i=0; i<array.length; i++) {
            System.out.println("Enter a number: \r");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Enter a number: ");
            }
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

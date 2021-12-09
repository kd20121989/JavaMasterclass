package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" integer values:\r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedDescending = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            sortedDescending[i] = array[i];
//        }
        int[] sortedDescending = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedDescending.length-1; i++) {
                if (sortedDescending[i] < sortedDescending [i+1]) {
                        temp = sortedDescending[i];
                        sortedDescending[i] = sortedDescending[i+1];
                        sortedDescending[i+1] = temp;
                        flag = true;
                }
            }
        }

        return sortedDescending;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length;i++) {
            System.out.println("Element "+i+", value is "+array[i]);
        }
    }
}

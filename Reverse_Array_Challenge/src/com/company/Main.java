package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};
        printArray(myIntArray);
        System.out.println("_________________________");
        reverse(myIntArray);
        printArray(myIntArray);
        System.out.println("_________________________");
        reverse(myIntArray);
        printArray(myIntArray);
    }

    private static void reverse(int[] array) {
        int otherSide = array.length-1;
        for (int i=0;i<(array.length/2);i++) {
            int temp = array[i];
//            array[i] = array[otherSide -i];
//            array[otherSide -i] = temp;
            array[i] = array[otherSide];
            array[otherSide] = temp;
            otherSide--;
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
    }
}

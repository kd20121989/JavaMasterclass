package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number<0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (10<number) {
            number/=10;
        }
        int firstDigit = number;
        return lastDigit + firstDigit;
    }
}

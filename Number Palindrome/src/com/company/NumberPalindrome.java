package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number==0) {
            return false;
        }
        int reverse = 0;
        int calculation = number;
        while (0 != number || 0 < number) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return calculation == reverse;
    }
}

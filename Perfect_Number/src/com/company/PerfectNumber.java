package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number<1) {
            return false;
        }

        int divisorsSum = 0;

        for (int i=1;i<number;i++) {
            if (number % i == 0) {
                divisorsSum += i;
            }
            if (divisorsSum==number){
                return true;
            }
        }
        return false;
    }
}

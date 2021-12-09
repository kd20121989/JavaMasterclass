package com.company;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (0 < number){
            if (number%2!=0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start <= end && 0 < start) {
            int sum = 0;
            for (; start <= end; start++) {
                if (isOdd(start)) {
                    sum += start;
                }
            }
            return sum;
        }
        return -1;
    }
}

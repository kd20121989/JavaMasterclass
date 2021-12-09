package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first<10 || second<10) {
            return -1;
        }

        int greatestMax=0;
        int divisor=0;

        if (first<=second) {
            greatestMax = first;
        } else  {
            greatestMax = second;
        }

        for (int i=greatestMax;1<=i;i--) {
            if ((first % i) == 0 && (second % i == 0)) {
                divisor = i;
                return divisor;
            }
        }
        return divisor;
    }
}

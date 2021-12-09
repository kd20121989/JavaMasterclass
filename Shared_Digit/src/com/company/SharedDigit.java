package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {
        if (10<=first && first<=99 && 10<=second && second<=99) {
            while (0<first) {
                int calcSecond = second;
                while (0<second){
                    if (first % 10 == calcSecond % 10) {
                        return true;
                    }
                    calcSecond/=10;
                }
                first/=10;
            }
            return false;
        }
        return false;
    }
}

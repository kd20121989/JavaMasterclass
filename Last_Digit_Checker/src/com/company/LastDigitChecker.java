package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            if (n1%10 == n2%10 || n1%10 == n3%10 || n2%10 == n3%10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isValid(int n) {
        if (10<=n && n<=1000) {
            return true;
        }
        return false;
    }
}

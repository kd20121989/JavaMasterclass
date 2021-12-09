package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (23 < hourOfDay || hourOfDay < 0) {
            return false;
        } else if (barking && ((hourOfDay < 8) || (hourOfDay > 22)) ) {
            return true;
        } return false;
    }
}

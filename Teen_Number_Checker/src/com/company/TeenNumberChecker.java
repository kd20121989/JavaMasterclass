package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third){
        if (isTeen(first) || (isTeen(second) || isTeen(third))){
            return true;
        } return false;
    }

    public static boolean isTeen(int years){
        if (13 <= years && years <= 19){
            return true;
        } return false;
    }
}

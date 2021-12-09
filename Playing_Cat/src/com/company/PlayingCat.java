package com.company;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        int upperTemperature = 35;
        if (summer){
            upperTemperature = 45;
        }
        if (25 <= temperature && temperature <= upperTemperature){
            return true;
        } return false;
    }
}

package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount<0 || smallCount<0 || goal<0){
            return false;
        }

        int togoal = 0;

        while ((togoal+5)<=goal && 0<bigCount){
            togoal+=5;
            bigCount-=1;
        }

        while ((togoal+1)<=goal && 0<smallCount) {
            togoal+=1;
            smallCount-=1;
        }

        if (togoal==goal) {
            return true;
        }
        return false;
    }
}

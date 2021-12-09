package com.company;

public class AreaCalculator {
    public static double area(double radius){
        if (0 <= radius) {
            return radius*radius*Math.PI;
        } return -1;
    }

    public static double area(double x, double y){
        if (0 <= x && 0 <= y) {
            return x * y;
        } return -1;
    }
}
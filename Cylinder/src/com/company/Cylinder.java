package com.company;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getVolume() {
        return height*getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (0<=height) ? height : 0;
    }
}

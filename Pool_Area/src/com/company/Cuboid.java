package com.company;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }

    public double getVolume() {
        return height*getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (0<height) ? height:0;
    }
}

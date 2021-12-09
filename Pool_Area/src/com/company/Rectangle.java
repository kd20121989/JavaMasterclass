package com.company;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getArea() {
        return width*length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (0<width) ? width:0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (0<length) ? length:0;
    }
}

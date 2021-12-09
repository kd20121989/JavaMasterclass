package com.company;


public class Bed {
    private String style;
    private int pillows;
    private Dimensions dimensions;

    public Bed(String style, int pillows, Dimensions dimensions) {
        this.style = style;
        this.pillows = pillows;
        this.dimensions = dimensions;
    }

    public void make() {
        System.out.println("Bed is ready");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

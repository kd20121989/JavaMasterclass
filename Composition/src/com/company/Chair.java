package com.company;

public class Chair {
    private String style;
    private Dimensions dimensions;

    public Chair(String style, Dimensions dimensions) {
        this.style = style;
        this.dimensions = dimensions;
    }

    public String getStyle() {
        return style;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

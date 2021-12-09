package com.company;

public class Cupboard {
    private String style;
    private Dimensions dimensions;

    public Cupboard(String style, Dimensions dimensions) {
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

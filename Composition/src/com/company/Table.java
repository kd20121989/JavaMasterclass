package com.company;

public class Table {
    private String style;
    private Dimensions dimensions;

    public Table(String style, Dimensions dimensions) {
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

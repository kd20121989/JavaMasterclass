package com.company;

public class Door {
    private String style;
    private int height, width;
    boolean isClosed;

    public Door(String style, int height, int width, boolean isClosed) {
        this.style = style;
        this.height = height;
        this.width = width;
        this.isClosed = isClosed;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isClosed() {
        return isClosed;
    }
}

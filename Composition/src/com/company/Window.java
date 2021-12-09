package com.company;

public class Window {
    private String direction;
    private int height, width;

    public Window(String direction, int height, int width) {
        this.direction = direction;
        this.height = height;
        this.width = width;
    }

    public String getDirection() {
        return direction;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

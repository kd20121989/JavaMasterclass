package com.company;

public class Lamp {
    private String style;
    private int globes, globeRating;

    public Lamp(String style, int globes, int globeRating) {
        this.style = style;
        this.globes = globes;
        this.globeRating = globeRating;
    }

    public void turnOn() {
        System.out.println("Light turned on");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobes() {
        return globes;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}

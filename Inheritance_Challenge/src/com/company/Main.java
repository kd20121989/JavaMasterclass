package com.company;

public class Main {

    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        System.out.println("________________");
        outlander.accelerate(30);
        System.out.println("________________");
        outlander.accelerate(20);
        System.out.println("________________");
        outlander.accelerate(-42);
    }
}

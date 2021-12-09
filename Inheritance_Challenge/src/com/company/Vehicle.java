package com.company;

public class Vehicle {
    private String name, size, controlType, color;
    private int weight, currentVelocity, currentMoveDirection, passengers, engine, doors, windows;
    boolean roof;


    public Vehicle(String name, String size, String controlType, String color, int weight,
                   int passengers, int engine, int doors, int windows, boolean roof) {
        this.name = name;
        this.size = size;
        this.controlType = controlType;
        this.color = color;
        this.weight = weight;
        this.passengers = passengers;
        this.engine = engine;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

    public void setMoveDirection(int moveDirection) {
        this.currentMoveDirection+= moveDirection;
        System.out.println("Vehicle is turning at " + currentMoveDirection);
    }

    public void move(int velocity, int moveDirection) {
        this.currentVelocity = velocity;
        this.currentMoveDirection = moveDirection;
        System.out.println("Vehicle is moving at " + currentVelocity + " in direction " + currentMoveDirection);

    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentMoveDirection() {
        return currentMoveDirection;
    }

    public void setCurrentMoveDirection(int currentMoveDirection) {
        this.currentMoveDirection = currentMoveDirection;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public boolean getRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }
}

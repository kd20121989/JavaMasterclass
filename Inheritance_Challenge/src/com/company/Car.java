package com.company;

public class Car extends Vehicle {

    private int wheels, gears, currentGear;
    private boolean isManual;

    public Car(String name, String size, String color, int weight, int passengers, int doors,
               int windows, boolean roof, int wheels, int gears, boolean isManual) {
        super(name, size, "Steer, pedals and gearbox.", color, weight, passengers,
                1, doors, windows, roof);
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car gear switched to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int moveDirection) {
        System.out.println("Car velocity " + speed + " direction " + moveDirection);
        move(speed,moveDirection);
    }

    public void steer(int moveDirection) {
        super.setMoveDirection(moveDirection);
    }
}

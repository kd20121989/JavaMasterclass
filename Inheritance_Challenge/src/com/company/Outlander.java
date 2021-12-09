package com.company;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", "silver", 2000, 7, 5, 8,
                true, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity==0) {
            stop();
            changeGear(1);
        } else if (0<newVelocity && newVelocity<=10) {
            changeGear(1);
        } else if (10<newVelocity && newVelocity<=20) {
            changeGear(2);
        } else if (20<newVelocity && newVelocity<=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (0<newVelocity) {
            changeVelocity(newVelocity,getCurrentMoveDirection());
        }
    }


}

package com.company;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double number1) {
        firstNumber = number1;
    }

    public void setSecondNumber(double number2) {
        secondNumber = number2;
    }

    public double getAdditionResult() {
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber*secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber==0) {
            return 0;
        }
        return firstNumber/secondNumber;
    }


}

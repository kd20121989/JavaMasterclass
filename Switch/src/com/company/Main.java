package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'G';

        switch (switchChar) {
            case 'A':
                System.out.println(switchChar);
                break;

            case 'B':
                System.out.println(switchChar);
                break;

            case 'C':
                System.out.println(switchChar);
                break;

                case 'D':
                    System.out.println(switchChar);
                    break;

                    case 'E':
                        System.out.println(switchChar);
                        break;

            default:
                System.out.println("Not found");
                break;
        }

        String month = "JAnuary";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println(month);
                break;
            case "june":
                System.out.println(month);
                break;
            default:
                System.out.println("Not sure");
        }

        // More code here
    }
}

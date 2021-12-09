package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count !=6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("for_________________________");
        for (count=1; count!=6; count++) {
            System.out.println("Count value is " + count);
        }
        System.out.println("true_________________________");
        count =1;
        while (true) {
            if (count ==6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("do_________________________");
        count =6;
        do {
            System.out.println("Count value is " + count);
            count++;

            if (100<count) {
                break;
            }
        } while (count!=6);
        System.out.println("Challenge_________________________");

        int number = 4;
        int finishNumber = 20;
        count = 0;

        while (number<=finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count==5){
                break;
            }
        }
        System.out.println("Total number of even numbers is " + count);
    }

    private static boolean isEvenNumber(int number) {
        if (0 < number){
            if (number%2==0) {
                return true;
            }
            return false;
        }
        return false;
    }
}

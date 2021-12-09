package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("ZERO");
        }

        int reverse = reverse(number);
        int digitsNumber = getDigitCount(number);
        int digitsReverse = getDigitCount(reverse);

        if (0<=reverse) {
            while (0 != reverse) {
                int lastDigit = reverse % 10;
                reverse /= 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    }
                }
            } else {
                return;
            }

        if (digitsReverse != digitsNumber) {
            for (int i=1; i <= digitsNumber - digitsReverse; i++){
                System.out.println("ZERO");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (0 != number) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number<0) {
            return -1;
        }

        int digits = 0;

        do {
            digits++;
            number /= 10;
        } while (0 != number);
        return digits;
    }
}

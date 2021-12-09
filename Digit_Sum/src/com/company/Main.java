package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(5555));
    }

    private static int sumDigits(int number) {
        int sum = 0;
        if (number>=10){
            while (0<number) {
                sum+=number%10;;
                number/=10;
            }
            return sum;
        }
        return -1;
    }
}

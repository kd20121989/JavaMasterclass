package com.company;

public class Main {

    public static void main(String[] args) {

        NumberToWords.numberToWords(123);
        System.out.println("_________________________");
        NumberToWords.numberToWords(1010);
        System.out.println("_________________________");
        NumberToWords.numberToWords(1000);
        System.out.println("_________________________");
        NumberToWords.numberToWords(-12);
        System.out.println("_________________________");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(2121));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println("_________________________");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
    }
}

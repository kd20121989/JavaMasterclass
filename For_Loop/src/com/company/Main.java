package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000,4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000,5.0));

        for(int i= 0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for(int i= 2; i<=8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("==========");
        for(int i= 8; 2<=i; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        for (int i=10, primes = 0; primes<3; i++) {
            if (isPrime(i)){
                System.out.println(i);
                primes++;
            }
        }

        int count = 0;
        for (int i= 10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 10) {
                    System.out.println("Exiting for Loop");
                    break;
                }
            }
        }

        for (int i=1, sum =0, count2=0; i<1000;i++) {
            if (i%5==0 && i%3==0) {
                sum += i;
                count2++;
                System.out.println(count2 + " Number is " + i);
                if (count2==5) {
                    System.out.println("Sum of all found numbers is " + sum);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
}


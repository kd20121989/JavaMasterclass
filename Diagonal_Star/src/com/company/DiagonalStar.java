package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number<5) {
            System.out.println("Invalid Value");
        } else {

            int row = 1;
            int column = 1;

            while (row<=number) {
                column = 1;
                while (column<=number) {
                    if (row==1 || row==number || column==1 || column==number || row==column || column==(number-row+1)) {
                        System.out.print("*");
                        column++;
                    } else {
                        System.out.println(" ");
                        column++;
                    }
                }
                row++;
                System.out.println();
            }
        }
    }
}
//            for (int i=1;number<i;i++) {
//                for (int j=1;number<j;j++) {
//                    if (i==1 || i==number || j==1 || j==number)
//                    System.out.print("*");
//                    else {
//                        if (i==j)
//                            System.out.print("*");
//                        else if ((i+j)==number)
//                            System.out.print("*");
//                        else
//                            System.out.println(" ");
//                    }
//                }
//            }
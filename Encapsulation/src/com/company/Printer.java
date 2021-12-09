package com.company;

public class Printer {
    private double tonerLevel=100;
    private int numberOfPagesPrinted=0;
    private boolean isDuplex;

    public Printer(double tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        setTonerLevel(tonerLevel);
        setNumberOfPagesPrinted(numberOfPagesPrinted);
        this.isDuplex = isDuplex;
        getTonerLevel();
        getNumberOfPagesPrinted();
        isDuplex();
        System.out.println("___________________________________");
    }

    private boolean validation(double min, double value) {
        return validation(min,value,value);
    }

    private boolean validation(double min, double value, double max) {
        if (min<=value && value<=max) {
            return true;
        } else return false;
    }

    public int printPages(int number) {
        if (!validation(1,number)) {
            System.out.println("Invalid number of pages");
            System.out.println("___________________________________");
            return -1;
        }
        int pagesToPrint=number;
        if (isDuplex) {
            pagesToPrint=number/2+number%2;
        }
        setNumberOfPagesPrinted(numberOfPagesPrinted+=pagesToPrint);
        tonerLevel-=(double)pagesToPrint/30;
        System.out.println(pagesToPrint+" pages printed");
        getNumberOfPagesPrinted();
        getTonerLevel();
        System.out.println("___________________________________");
        return 0;
    }

    public int refillToner() {
        setTonerLevel(100);
        System.out.println("Toner refilled.");
        getTonerLevel();
        System.out.println("___________________________________");
        return 0;
    }

    public int addToner(int tonerAmount) {
        if (!validation(1,tonerAmount) || !validation(0,tonerLevel+tonerAmount,100)) {
            System.out.println("Invalid amount of toner");
            System.out.println("___________________________________");
            return -1;
        } else {
            setTonerLevel(tonerLevel+tonerAmount);
            System.out.println("Toner added");
            getTonerLevel();
            System.out.println("___________________________________");
            return 0;
        }
    }

    public void getPrinterInfo() {
        getNumberOfPagesPrinted();
        getTonerLevel();
        isDuplex();
        System.out.println("___________________________________");
    }

    public double getTonerLevel() {
        System.out.println("Toner level: "+tonerLevel+"%");
        return tonerLevel;
    }

    private int setTonerLevel(double tonerLevel) {
        if (validation(0,tonerLevel,100)) {
            this.tonerLevel=tonerLevel;
            return 0;
        } else return -1;
    }

    public int getNumberOfPagesPrinted() {
        System.out.println("Total number of printed pages: "+numberOfPagesPrinted);
        return numberOfPagesPrinted;
    }

    private int setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        if (validation(0,numberOfPagesPrinted)) {
            this.numberOfPagesPrinted=numberOfPagesPrinted;
            return 0;
        } else return -1;
    }

    public boolean isDuplex() {
        System.out.println("Duplex support: "+isDuplex);
        return isDuplex;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15,45,45);
        Case theCase = new Case("Black & Cool","Aerocool","650", dimensions);

        Monitor theMonitor = new Monitor("ProLite X2783HSU","iiama",27,
                new Resolution(1920,1080));

        Motherboard theMotherboard = new Motherboard("X99 Deluxe","Asus","New one",
                4, 5);

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,1000,"red");
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

        System.out.println("__________________");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling (285,"White");

        Floor floor = new Floor(15);

        Door door = new Door("Classic",200,85,false);

        Window window = new Window("Somewhere",200,280);

        Table table = new Table("Simple",new Dimensions(100,60,30));

        Chair chair = new Chair("Metallic",new Dimensions(40,130,45));

        Cupboard cupboard = new Cupboard("Simple",new Dimensions(200,280, 50));

        Bed bed = new Bed("Simple",2, new Dimensions(200,45,200));

        Lamp lamp = new Lamp("Nature",3,45);

        Room bedroom = new Room("Bedroom",wall1,wall2,wall3,wall4,ceiling,floor,door,window,lamp,
                table,thePC,bed,chair,cupboard);

        bedroom.makeBed();

        System.out.println("_______________________");

        bedroom.getLamp().turnOn();
    }
}

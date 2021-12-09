package com.company;

public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Floor floor;
    private Door door;
    private Window window;
    private Lamp lamp;
    private Table table;
    private PC pc;
    private Bed bed;
    private Chair chair;
    private Cupboard cupboard;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Floor floor,
                Door door, Window window, Lamp lamp, Table table, PC pc, Bed bed, Chair chair,
                Cupboard cupboard) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.floor = floor;
        this.door = door;
        this.window = window;
        this.lamp = lamp;
        this.table = table;
        this.pc = pc;
        this.bed = bed;
        this.chair = chair;
        this.cupboard = cupboard;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Making bed");
        bed.make();
    }
}

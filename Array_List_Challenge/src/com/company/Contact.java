package com.company;

public class Contact {
    private String name,
    number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static Contact createContact(String name, String number) {
        return new Contact(name, number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

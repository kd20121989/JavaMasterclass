package com.company;

public class Person {

    private String firstName;
    private String lastdName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastdName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        firstName=name;
    }

    public void setLastName(String last) {
        lastdName=last;
    }

    public void setAge(int number) {
        if (0<=number && number<=100) {
            age = number;
        } else {
            age=0;
        }
    }

    public boolean isTeen() {
        if (12<age && age<20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastdName.isEmpty()) {
            return "";
        } else if (lastdName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastdName;
        } else {
            return firstName+" "+lastdName;
        }

    }

}

package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+79675915301");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter your action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case  1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.println("Please enter new contact's name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter new contact's phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name,number);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added. Name: "+name+", phone number: "+number);
        } else {
            System.out.println("Contact with name "+name+" already existing.");
        }
    }

    private static void  updateContact() {
        System.out.println("Enter contact name to update: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact==null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        name = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, newNumber);
        if (mobilePhone.modifyContact(existingContact, newContact)) {
            System.out.println("Contact successfully updated");
        } else {
            System.out.println("Error. Contact not updated.");
        }
    }

    private static void  deleteContact() {
        System.out.println("Enter contact name to delete: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        mobilePhone.removeContact(existingContact);
        System.out.println("Contact deleted successfully");
    }

    private static void  queryContact() {
        System.out.println("Enter contact name to query: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: "+existingContact.getName()+" phone number is "+existingContact.getNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n"+
                "1 - to print contacts\n"+
                "2 - to add new contact\n"+
                "3 - to update existing contact\n"+
                "4 - to delete contact\n"+
                "5 - to query if contact exists\n"+
                "6 - to print a list of available actions");
        System.out.println("Choose your action: ");
    }

}

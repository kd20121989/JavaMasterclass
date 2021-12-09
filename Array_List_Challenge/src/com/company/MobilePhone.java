package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >=0) {
            System.out.println("Contact is already existing.");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean modifyContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position<0) {
            System.out.println(oldContact.getName()+" , was not found");
            return false;
        }
        if (findContact(newContact.getName()) >=0) {
            System.out.println("Contact is already existing.");
            return false;
        }

        this.contactList.set(position, newContact);
        System.out.println(oldContact.getName()+" , was replaced with "+newContact.getName());
        return true;
    }

    public boolean removeContact (Contact contact) {
        int position = findContact(contact);
        if (position<0) {
            System.out.println(contact.getName()+" , was not found");
            return false;
        }

        this.contactList.remove(position);
        System.out.println(contact.getName()+" , was deleted");
        return true;
    }

    private int findContact(Contact contact) {
        return contactList.indexOf(contact);
    }
    private int findContact(String name) {
        for (int i=0; i<this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (0<findContact(contact)) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (0<=position) {
            return contactList.get(position);
        }
        return null;
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " contacts in your contact list");
        for (int i=0; i<contactList.size(); i++) {
            System.out.println((i+1) + ". " +
                    contactList.get(i).getName() + " -> "+
                    contactList.get(i).getNumber());
        }
    }

}

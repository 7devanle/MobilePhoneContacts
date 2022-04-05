package com.company.udemy.arryaLists.MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private static ArrayList<Contact> GoogleContactList = new ArrayList<>();

    public ContactList() {
        Contact defaultContact = new Contact();
        GoogleContactList.add(defaultContact);
    }

    public void addContact(Contact contact){
        GoogleContactList.add(contact);
    }
    public void modifyContact(int position, Contact newContact){
        GoogleContactList.set(position, newContact);
    }
    public void deleteContact(Contact contact){
        GoogleContactList.remove(contact);
    }
    public Contact retrieveContact(int position){
        return GoogleContactList.get(position);
    }

}

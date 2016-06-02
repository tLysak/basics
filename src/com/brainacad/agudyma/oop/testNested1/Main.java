package com.brainacad.agudyma.oop.testNested1;


/**
 * Created by User on 01.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        String name = "a";
        String phoneNumber = String.valueOf(2222);
        MyPhoneBook.PhoneNumber contact1 = new MyPhoneBook.PhoneNumber("Sasha","050123456");
        MyPhoneBook.PhoneNumber contact2 = new MyPhoneBook.PhoneNumber("Vova","067987654" );
        MyPhoneBook.PhoneNumber contact3 = new MyPhoneBook.PhoneNumber("Vova1","067987654" );
        MyPhoneBook.PhoneNumber contact4 = new MyPhoneBook.PhoneNumber("Vova2","067987654" );
        MyPhoneBook.PhoneNumber contact5 = new MyPhoneBook.PhoneNumber("Vova3","067987654" );

        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Sasha","050123456");
        phoneBook.addPhoneNumber("Vova","067987654");
        phoneBook.addPhoneNumber("Vova1","067987654" );
        phoneBook.addPhoneNumber("Vova2","067987654");
        phoneBook.addPhoneNumber("Vova3","067987654");
        System.out.println();
    }
}

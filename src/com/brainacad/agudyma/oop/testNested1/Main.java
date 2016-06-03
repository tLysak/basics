package com.brainacad.agudyma.oop.testNested1;


/**
 * Created by User on 01.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Sasha","050123456");
        phoneBook.addPhoneNumber("Vova","067987654");
        phoneBook.addPhoneNumber("Vova1","067987654" );
        phoneBook.addPhoneNumber("Vova2","067987654");
        phoneBook.addPhoneNumber("Vova3","067987654");

        phoneBook.printPhoneBook();
        System.out.println(phoneBook.printPhoneBook());
    }
}

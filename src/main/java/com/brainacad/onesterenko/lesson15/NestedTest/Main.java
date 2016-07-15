package com.brainacad.onesterenko.lesson15.NestedTest;

/**
 * Created by User on 01.06.2016.
 */
public class Main {
    public static void main(String[] args) {


        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Andrew","06789823");
        myPhoneBook.addPhoneNumber("Bober","911");
        myPhoneBook.addPhoneNumber("Sadist","02");
        myPhoneBook.addPhoneNumber("Alex","145");
        myPhoneBook.addPhoneNumber("Dalay Lama","+390877845");


        myPhoneBook.printPhoneBook();


    }
}

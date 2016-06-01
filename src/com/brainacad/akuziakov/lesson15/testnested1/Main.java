package com.brainacad.akuziakov.lesson15.testnested1;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();

        for (int i = 1; i <= 5; i++) {
            try {
                myPhoneBook.addPhoneNumber("Number" + i, "+38093 " + i + i + i + "-" + i + i + "-" + i + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        myPhoneBook.printPhoneBook();
    }
}

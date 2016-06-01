package com.brainacad.akuziakov.lesson15.testnested1;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();

        for (int i=1;i<=5;i++){
            myPhoneBook.addPhoneNumber("Number"+i, "+380xx "+i+i+i+"-"+i+i+"-"+i+i);
        }

        myPhoneBook.printPhoneBook();
    }
}

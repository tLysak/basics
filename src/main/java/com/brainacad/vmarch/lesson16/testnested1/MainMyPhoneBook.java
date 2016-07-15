package com.brainacad.vmarch.lesson16.testnested1;


public class MainMyPhoneBook {

    public static void main(String[] args) {

        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Joy", "0661111111");
        myPhoneBook.addPhoneNumber("Oggy", "0502222222");
        myPhoneBook.addPhoneNumber("Degy", "0993333333");
        myPhoneBook.addPhoneNumber("Norb", "0734444444");
        myPhoneBook.addPhoneNumber("Didi", "0635555555");
        myPhoneBook.addPhoneNumber("Diodo", "0675555555");
        myPhoneBook.addPhoneNumber("Dili", "0635555675");
        myPhoneBook.addPhoneNumber("Roma", "0635545555");
        myPhoneBook.addPhoneNumber("Rita", "0983555555");
        myPhoneBook.addPhoneNumber("Gita", "0975355555");

        myPhoneBook.sortByName();
        System.out.println("Sorted by name: " + myPhoneBook.toString());

        myPhoneBook.sortByPhoneNumber();
        System.out.println("Sorted by phone: " + myPhoneBook.toString());

    }
}

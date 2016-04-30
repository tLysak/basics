package com.brainacad.tlysak.oop;

/**
 * Created by tymur on 4/29/16.
 */
public class Accounter {
    public static  int counter;

    public static void main(String[] args) {
        System.out.println("starting");
        Person person = new Person(123);
        person = person.initPerson("Tymur", "Petrov").initPerson(78, 1_000_000);
        person.initPerson("Petro", 54);

    }
}

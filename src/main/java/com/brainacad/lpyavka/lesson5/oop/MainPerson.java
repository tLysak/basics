package com.brainacad.lpyavka.lesson5.oop;

/**
 * Created by Sony on 29.04.2016.
 */
public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person(56);
        person = person.initPerson("Steve", "Jobs").initPerson(45, 100_000);
        Person person2 = person.initPerson("Petro", 54);
    }
}

package com.brainacad.akuziakov.oop.Lesson7.VarArgs;

public class Accounter {
    public static void main(String[] args) {

        Person person = new Person(123);
        Person person2 = person.initPerson("Ivan", "Ivanov").initPerson(78, 1_000_000);
    }
}

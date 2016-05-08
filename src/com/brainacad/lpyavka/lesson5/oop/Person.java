package com.brainacad.lpyavka.lesson5.oop;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long salary;

    public Person(int age) {
        this.age = age;
    }

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person initPerson(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }

    public Person initPerson(final int age, final long salary) {
        if (age < 0) {
            System.out.println("Age was not set");
            this.age = 0;
        } else {
            this.age = age;
        }

        this.age = age;
        this.salary = salary;
        return this;
    }

    public Person initPerson(final String lastName, final int age) {
        initPerson(null, lastName);
        initPerson(age, 0l);
        return this;
    }
}

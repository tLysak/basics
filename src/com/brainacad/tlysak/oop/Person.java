package com.brainacad.tlysak.oop;

/**
 * Created by tymur on 4/29/16.
 */
public class Person {
    public static final double PI = 3.14;
    public static  double count;

    private String firstName;
    private String lastName;
    private int age;
    private long salary;


    {

        System.out.println("code block");
    }

    static {
        System.out.println("static block");

    }


    public Person(int age) {
        System.out.println("constructor");

    }

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person initPerson(final String firstName, final String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }

    public Person initPerson(final int age, final long salary) {
        if(age < 0) {
            System.out.println("age was not set, usind default age");
            this.age = 0;
        } else {
            this.age = age;
        }
        this.salary = salary;
        return this;
    }

    public Person initPerson(final String lastName, final int age) {
        initPerson(null, lastName);
        initPerson(age, 0l);

        return this;
    }
}

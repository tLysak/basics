package com.brainacad.vmarch.lesson14.exeptiondemo;

/**
 * Created by User on 28.06.16.
 */
public class Person {

    private static String firstName;
    private static String lastName;
    private static int age;

    Person(String firstName, String lastName, int age) throws InvalidAgeExeption {
        Person.firstName = firstName;
        Person.lastName = lastName;
        Person.age = age;

        try {
            if (age < 1 || age > 120) {
                throw new InvalidAgeExeption();
            }

            System.out.println(firstName + " " + lastName + ", " + age);


        } catch (InvalidAgeExeption e) {

            System.out.println("Age can not be less 1 or more 120!!!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Person.age = age;
    }
}



package com.brainacad.agudyma.oop.testNested1;

import java.util.Arrays;

/**
 * Created by User on 01.06.2016.
 */
public class MyPhoneBook {
    int n = 10;
    private PhoneNumber [] phoneNumbers  = new   PhoneNumber[n];

    public void addPhoneNumber(String name, String phone) {
        for (n=0;n<phoneNumbers.length;n++){
            PhoneNumber contact = new PhoneNumber(name,phone);
            phoneNumbers [n] = contact;

        }


    }

    public static class PhoneNumber{
        String name;
        String phone;

        public PhoneNumber(String name, String phone){
            this.name = name;
            this.phone = phone;
            }



           @Override
        public String toString() {
            return "name: " +name + " phone: " + phone;
        }
    }


}
//Create new project called  TestNested1. Add package “com.brainacad.oop.testnest1”.
//        Create a class MyPhoneBook which contains static nested class PhoneNumber.
//        1) Add to class PhoneNumber two fields: name (of String type) and phone (оf String type), constructor with
// two parameters (name, phone) and getters for each class field.
//        Override the toString() method in PhoneNumber to return information about name and phone number.
//        2) Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber (array length of 10).
//        3) Add to class MyPhoneBook public method addPhoneNumber()  with  two parameters, of String type (name, phone)
// which use it to create new PhoneNumber object and pass it to next available array element.
//        4) Add to class MyPhoneBook public method printPhoneBook() which iterates over phoneNumbers  array in loop and
// print name and phone number information of each record to console.
//        5) Create a class Main with a main() method. Add to method main() code that creates MyPhoneBook object and
// fill it with five phone number records. Add code to invoke printPhoneBook() method.
//        6) Execute the program.
//        Example of program output:
//        Name: Sasha, phone: 050123456
//        Name: Vova, phone: 067987654
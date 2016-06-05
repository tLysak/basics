package com.brainacad.agudyma.oop.testNested1;

import java.util.Arrays;

/**
 * Created by User on 01.06.2016.
 */
public class MyPhoneBook {
    private int i = 10;
    private PhoneNumber [] phoneNumbers  = new   PhoneNumber[i];

    public void addPhoneNumber(String name, String phone) {

        PhoneNumber contact = new PhoneNumber(name, phone);

        System.out.println(contact);
        }
//works if public int i =1;
//        for (int i = 0; i < phoneNumbers.length; i++) {
//            phoneNumbers[i++] = contact;
//            System.out.println(contact);
//
//        }

    public void printPhoneBook(){

//        return Arrays.toString(phoneNumbers) ;
    }


    public static class PhoneNumber{
        String name;
        String phone;

        public PhoneNumber(String name, String phone){
            this.name = name;
            this.phone = phone;
            }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name: " +getName() + " phone: " + getPhone() ;
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
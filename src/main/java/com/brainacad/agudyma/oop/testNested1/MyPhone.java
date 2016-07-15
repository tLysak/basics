package com.brainacad.agudyma.oop.testNested1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 01.06.2016.
 */
public class MyPhone {
    
    public MyPhoneBook myPhoneBook;

    public  void swichOn(){
        System.out.println("\"Loading PhoneBook records...\"");

        myPhoneBook  = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Sasha","23537431451");
        myPhoneBook.addPhoneNumber("Dima","145136222");
        myPhoneBook.addPhoneNumber
                ("Borat","2351345147" );
        myPhoneBook.addPhoneNumber("Givi","845134626");
        myPhoneBook.addPhoneNumber("Mimino","134513465");
        myPhoneBook.addPhoneNumber("vmarch","13461466");
        myPhoneBook.addPhoneNumber("Rabinovich","41461461");
        myPhoneBook.addPhoneNumber("Malevich","313461616" );
        myPhoneBook.addPhoneNumber("Abramovich","913461361");
        myPhoneBook.addPhoneNumber("Zuckerman","01461616");

        System.out.println("OK");
    }

    public static void call() {
        System.out.println("Enter contact number");
        Scanner scanner = new Scanner(System.in);
        int contactNumber = scanner.nextInt();
        if (contactNumber > MyPhoneBook.myPhoneBookSize){
            System.out.println("Invalid contact number. Contact number must be less than " + MyPhoneBook.myPhoneBookSize);
                    }
        System.out.println("Calling to " + MyPhoneBook.phoneNumbers[contactNumber-1] );
    }

    public static class MyPhoneBook {
        private static int myPhoneBookSize = 10;
        private int counter = 0;
        private static PhoneNumber[] phoneNumbers = new PhoneNumber[myPhoneBookSize];

        public void addPhoneNumber(String name, String phone) {

            PhoneNumber contact = new PhoneNumber(name, phone);
            phoneNumbers[counter] = contact;

            if (counter >= (myPhoneBookSize - 1)) {
                System.out.println("Memory is full");
            } else counter++;
        }

        public void printPhoneBook() {
            System.out.println("you have " + (myPhoneBookSize  - counter) + " free slots ");
            for (int a = 0; a < phoneNumbers.length; a++) {
                System.out.println(phoneNumbers[a]);
            }
        }
        public class PhoneNumber {
            String name;
            String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getPhone() {
                return phone;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return  getName()  + getPhone();
            }
        }   //    @Override
//    public int sortByName() {
//        Arrays.sort(phoneNumbers);
//
//        return 0;
//    }
//
//    @Override
//    public int sortByNumber() {
//        Arrays.sort(phoneNumbers);
//
//        return 0;
//    }
    }

}



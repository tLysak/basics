package com.brainacad.skozigon.Labs.labs2_12.testnest1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by skozigon on 01.06.2016.
 */
public class MyPhone {
    private MyPhoneBook addressBook;


    public MyPhone() {
        this.switchOn();
    }

    public void switchOn() {

        System.out.println("Loading PhoneBook records…");
        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Vasya", "0671235874");
        myPhoneBook.addPhoneNumber("Petya", "0502138547");
        myPhoneBook.addPhoneNumber("Sasha", "0998743258");
        myPhoneBook.addPhoneNumber("Oleg", "0672458963");
        myPhoneBook.addPhoneNumber("Opanas", "0508742365");

        myPhoneBook.printPhoneBook();
        System.out.println("Ok!");

        addressBook = myPhoneBook;

    }

    public void call(int i) {

        System.out.println("Calling to: " + i);
        System.out.println(addressBook.getNumberById(i));

    }

    class MyPhoneBook {
        int i = 0;
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public void printPhoneBook() {
            for (MyPhoneBook.PhoneNumber pn : phoneNumbers) {
                if (pn != null)
                    System.out.println(pn);
            }
            return;
        }

        public PhoneNumber getNumberById(int i){
            return phoneNumbers[i];
        }


        public void addPhoneNumber(String name, String phone) {
            if (i <= phoneNumbers.length - 1) {
                phoneNumbers[i] = new MyPhoneBook.PhoneNumber(name, phone);
                i++;
            }

        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    if (o1 == null || o2 == null) return 0;

                    return o1.getName().compareTo(o2.getName());
                }
            });

        }

        public void sortByNumber() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    if (o1 == null || o2 == null) return 0;

                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });

        }

        class PhoneNumber {
            String name;
            String phone;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Name: " + this.name + " Number: " + this.phone + " ";
            }

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }
        }
    }

}

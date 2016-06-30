package com.brainacad.vmarch.lesson16.testnested1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private int a = 10;
    private int i = 0;

    private PhoneNumber[] phoneNumbers = new PhoneNumber[a];

    public void addPhoneNumber(String name, String phone) {

        PhoneNumber phoneNumber = new PhoneNumber(name, phone);

        if (phoneNumbers[i] == null) {
            phoneNumbers[i] = phoneNumber;
            System.out.println(phoneNumbers[i]);

            if (i < (a - 1)) i++;

        } else if (i < a - 1) {
            i++;

        } else {

            System.out.println("memory is full");
        }
    }

    public void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortByPhoneNumber() {

        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });
    }

    @Override
    public String toString() {
        return Arrays.toString(phoneNumbers);
    }


    private static class PhoneNumber {

        private String name;
        private String phone;

        private PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        private String getName() {
            return name;
        }
        private void setName(String name) {
            this.name = name;
        }

        private String getPhone() {
            return phone;
        }
        private void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phone;

        }
    }
}
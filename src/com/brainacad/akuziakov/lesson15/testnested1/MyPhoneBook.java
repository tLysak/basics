package com.brainacad.akuziakov.lesson15.testnested1;

import java.util.Arrays;

public class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private int numbersCount;

    public MyPhoneBook() {
        numbersCount = 0;
    }

    public void addPhoneNumber(final String name, final String phone) {
        if (canAddPhoneNumber(name, phone)) {
            phoneNumbers[numbersCount] = new PhoneNumber(name, phone);
            numbersCount++;
        }
    }

    public void printPhoneBook() {
        for (int i = 0; i < numbersCount; i++) {
            System.out.println(phoneNumbers[i]);
        }
    }

    private boolean canAddPhoneNumber(String name, String phone) {
        return isValid(name) && isValid(phone) && !isFull(phoneNumbers, numbersCount);
    }

    private boolean isFull(final PhoneNumber[] phoneNumbers, final int numbersCount) {
        return phoneNumbers.length < numbersCount;
    }

    private boolean isValid(String name) {
        return (!name.isEmpty() && null != name);
    }

    public static class PhoneNumber {
        private final String name;
        private final String phone;

        public PhoneNumber(final String name, final String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return String.format("Name: %s,\tPhone: %s", getName(), getPhone());
        }
    }
}

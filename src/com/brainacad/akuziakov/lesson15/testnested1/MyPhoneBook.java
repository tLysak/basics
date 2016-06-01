package com.brainacad.akuziakov.lesson15.testnested1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        return validateName(name) && validatePhone(phone) && !isFull(phoneNumbers, numbersCount);
    }

    private boolean validatePhone(String phone) {
        if (isValidString(phone)) {
            phone.trim();
            phone.replace(" ", "");
            phone.replace("-","");
            Pattern pattern = Pattern.compile("^+?[1-9]{1}[0-9]{11}");
            String tmpStr=phone.replace(' ','\0').replace('-','\0');
            Matcher matcher = pattern.matcher(phone.replace(' ','\0').replace('-','\0'));
            boolean result= matcher.matches();
            return result;
        }
        return false;
    }

    private boolean validateName(String name) {
        return isValidString(name);
    }

    private boolean isFull(final PhoneNumber[] phoneNumbers, final int numbersCount) {
        return phoneNumbers.length < numbersCount;
    }

    private boolean isValidString(String name) {
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

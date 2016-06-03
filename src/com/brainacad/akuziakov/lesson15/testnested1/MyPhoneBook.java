package com.brainacad.akuziakov.lesson15.testnested1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPhoneBook {

    public static final int PNONEBOOK_SIZE = 10;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[PNONEBOOK_SIZE];
    private int numbersCount;

    public MyPhoneBook() {
        numbersCount = 0;
    }

    public void addPhoneNumber(final String name, final String phone) throws Exception {
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

    private boolean canAddPhoneNumber(String name, String phone) throws Exception {
        boolean isValidPhoneNumber = validateName(name) && validatePhone(phone) && !isFull(phoneNumbers, numbersCount);
        if (!isValidPhoneNumber) {
            throw new Exception("Can't add phone number.");
        }
        return true;
    }

    private boolean validatePhone(final String phone) {
        if (isValidString(phone)) {
            String tmpPhone;
            tmpPhone = phone.replaceAll(" |-", "");
            Pattern pattern = Pattern.compile("^\\+?[1-9]{1}[0-9]{11}");
            Matcher matcher = pattern.matcher(tmpPhone);
            return matcher.matches();
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
        return (null != name && !name.isEmpty());
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

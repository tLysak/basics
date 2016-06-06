package com.brainacad.vmarch.lesson16.testnested1;


public class MyPhoneBook {

    int a = 10;
    int i = 0;

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

//    public void printPhoneBook() {
//        System.out.println(Arrays.toString(phoneNumbers));
//    }


    public static class PhoneNumber {


        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

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
            return "name: " + name + ", phone: " + phone;

        }
    }
}


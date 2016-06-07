package com.brainacad.onesterenko.lesson15.NestedTest;

import java.util.Arrays;

/**
 *
 */
public class MyPhoneBook {
    private PhoneNumber phoneNumbers [] = new PhoneNumber[10];
    String b;//string - result of Contact list printing
    public int counter =0;
    public PhoneNumber addPhoneNumber (String name, String phone) {

         PhoneNumber  pn = new PhoneNumber(name,phone);

        for (int i=counter; i<phoneNumbers.length; i++)
        phoneNumbers[counter] = pn;
        counter++;
        return pn;
    }
  /*  public MyPhoneBook sortByName(){
       Arrays.sort(phoneNumbers);
      return phoneNumbers;
    }*/


    public  String printPhoneBook(){
        for (int i = 0; i < phoneNumbers.length; i++) {
           if (phoneNumbers[i] !=null){

            b = phoneNumbers[i].toString();
            System.out.println(b);}
        }
        return b;
    }

    static class PhoneNumber implements Comparable {
        public PhoneNumber(String name, String phone) {
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

        private  String name;
        private String phone;

        @Override
        public String toString (){
         return ("Contact name - " + this.name + " Phone number - " + this.phone );
        }
        @Override
        public boolean equals (Object o){
            if (this ==o) return true;
            if (!(o instanceof PhoneNumber)) return false;
            PhoneNumber bicycle = (PhoneNumber) o;
            if (!name.equals(bicycle.name) ) return false;
            return true;
        }
        @Override
        public int compareTo(Object o) {
            o = (PhoneNumber) o;
            PhoneNumber bicycle = (PhoneNumber)o;
            return this.name.compareTo(bicycle.name);
        }
    }
}

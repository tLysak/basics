package com.brainacad.agudyma.oop.testNested1;


import java.util.Arrays;

import static com.brainacad.agudyma.oop.testNested1.MyPhone.*;

/**
 * Created by User on 01.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyPhone.MyPhoneBook phoneBook = new MyPhone.MyPhoneBook();
        phoneBook.addPhoneNumber("Sasha","23537431451");
        phoneBook.addPhoneNumber("Dima","145136222");
        phoneBook.addPhoneNumber("Borat","2351345147" );
        phoneBook.addPhoneNumber("Givi","845134626");
        phoneBook.addPhoneNumber("Mimino","134513465");
        phoneBook.addPhoneNumber("vmarch","13461466");
        phoneBook.addPhoneNumber("Rabinovich","41461461");
        phoneBook.addPhoneNumber("Malevich","313461616" );
        phoneBook.addPhoneNumber("Abramovich","913461361");
        phoneBook.addPhoneNumber("Zuckerman","01461616");

//        phoneBook.printPhoneBook();

//        phoneBook.addPhoneNumber("ssss","8646");
        MyPhone.swichOn();
        MyPhone.call();
    }
}

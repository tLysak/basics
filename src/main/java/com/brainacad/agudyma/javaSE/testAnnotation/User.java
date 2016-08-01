package com.brainacad.agudyma.javaSE.testAnnotation;

/**
 * Created by User on 8/1/2016.
 */
public class User {
    int age;
    public User (int age){
        this.age = age;
    }
    @Log(filename = "age.log")
    public int getAge() {
        return age;
    }
}

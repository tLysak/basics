package com.brainacad.akuziakov.lesson14.ageexception;

public class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age<=0){
            throw new AgeException("Age must be greater than zero.");
        }
        this.age = age;
    }

    public Human(int age) throws AgeException {
        //this.age=1;
        setAge(age);
    }
}

package com.brainacad.skozigon.lesson14;

/**
 * Created by skozigon on 27.05.2016.
 */
public class Human {
    private int age;


    public void setAge(int age) throws Exception{
        if (age<=0){
            throw new Exception("Incorrect. Age<=0");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

package com.brainacad.vmarch.labs.lambdatest;

public class UserObject {
    private int age;

    UserObject(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

@Override
    public String toString(){
    return "age" + getAge();
    }
}


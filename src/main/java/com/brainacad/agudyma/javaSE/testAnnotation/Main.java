package com.brainacad.agudyma.javaSE.testAnnotation;

import com.brainacad.akuziakov.oop.Lesson7.VarArgs.Person;

/**
 * Created by User on 8/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(100);
        Car car2 = new Car (150);
        User user1 = new User(22);
        User user2 =new  User(33);

        Process process1 = new Process(car1,user1);

    }
}

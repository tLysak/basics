package com.brainacad.akuziakov.Lesson8_Jars.com.brainacad.main;

import com.brainacad.akuziakov.Lesson8_Jars.com.brainacad.shapes.Triangle;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd=new Random();

        Triangle triangle=new Triangle(rnd.nextInt(10), rnd.nextInt(10), rnd.nextInt(10));

        System.out.println("Triangle square is: "+triangle.getSquare());
    }
}
package com.brainacad.lpyavka.lesson8;

import com.brainacad.lpyavka.lesson8.shapes.Triangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sideOne = random.nextInt(100);
        int sideTwo = random.nextInt(100);
        int sub = Math.abs(sideOne - sideTwo);
        int sideThree = sub + random.nextInt(sideOne + sideTwo - sub);
        Triangle triangle = new Triangle(sideOne, sideTwo, sideThree);
        System.out.println(triangle.toString());
        System.out.println("Triangle area is " + triangle.getArea()+ " .");
    }
}

package com.brainacad.lpyavka.lesson8;

import com.brainacad.lpyavka.lesson8.shapes.Triangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Triangle triangle = new Triangle(random.nextInt(100), random.nextInt(100), random.nextInt(100));
        System.out.println(triangle.toString());
        System.out.println("Triangle area is " + triangle.getArea()+ " .");
    }
}

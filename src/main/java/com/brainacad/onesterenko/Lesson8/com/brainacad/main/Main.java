package com.brainacad.onesterenko.Lesson8.com.brainacad.main;

import com.brainacad.onesterenko.Lesson8.com.brainacad.shapes.Triangle;

import java.util.Random;

/**
 * Created by User on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random(9);
        Triangle triangle = new Triangle(3,5,6);

          System.out.println("square is " +triangle.getSquare() );
    }
}

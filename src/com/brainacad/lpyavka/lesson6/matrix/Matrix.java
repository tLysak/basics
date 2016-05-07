package com.brainacad.lpyavka.lesson6.matrix;

public class Matrix {
    public void initialize(int length, int height, int... values) {
        int sumOfElements = length * height;
        if (values.length != sumOfElements) {
            System.out.println("Warning: sum of elements does not correspond with matrix capacity");
        } else {
            System.out.println("Well done: matrix of " + sumOfElements + " elements was successfully created.");
        }
    }
}

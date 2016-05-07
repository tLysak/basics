package com.brainacad.lpyavka.lesson6.matrix;

import com.brainacad.lpyavka.lesson6.matrix.Matrix;

public class MainMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(2, 3, 1, 2, 3, 4, 5, 6);
        System.out.println();
        matrix.initialize(2, 3, 1, 2, 3, 4, 5, 6, 7);
    }
}

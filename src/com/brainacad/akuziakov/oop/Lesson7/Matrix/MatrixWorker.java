package com.brainacad.akuziakov.oop.Lesson7.Matrix;

public class MatrixWorker {
    public static void main(String[] args) {

        Matrix firstMatrix = new Matrix();
        Matrix secondMatrix = new Matrix();

        firstMatrix.setState(new int[][]{{4, 5}, {1, 2}});
        secondMatrix.setState(new int[][]{{2, 1}, {5, 1}});

        System.out.println(firstMatrix.getStringState());
        System.out.println(secondMatrix.getStringState());

        firstMatrix.add(secondMatrix);

        System.out.println(firstMatrix.getStringState());
    }
}

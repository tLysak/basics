package com.brainacad.lpyavka.lesson5.oop;

public class MainMatrix {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix();
        Matrix secondMatrix = new Matrix();

        firstMatrix.setState(new int[][]{{4, 5}, {1, 4}});
        secondMatrix.setState(new int[][]{{2, 1}, {5, 1}});

        System.out.println(firstMatrix.getStringState());
        firstMatrix.sum(secondMatrix);
        System.out.println(firstMatrix.getStringState());
    }
}

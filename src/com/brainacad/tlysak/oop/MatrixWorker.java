package com.brainacad.tlysak.oop;

/**
 * Created by tymur on 4/29/16.
 */
public class MatrixWorker {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix();
        Matrix secondMatrix = new Matrix();

        firstMatrix.setState(new int[][]{{4, 5},{1, 4}});
        secondMatrix.setState(new int[][]{{2, 1},{5, 1}});

        System.out.println(firstMatrix.getStringState());

        firstMatrix.summ(null);

        System.out.println(firstMatrix.getStringState());

    }
}

package com.brainacad.skozigon.Lesson6.Lesson6_1;

import java.util.Arrays;

/**
 * Created by skozigon on 29.04.2016.
 */
public class Matrix {
    private int[][] state;
    public void multiply(final Matrix externalMatrix){
        int[][] external = externalMatrix.getState();
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state.length ; j++) {
                state[i][j] = state[i][j] + external[i][j];
            }
        }
    }

    public void sum(Matrix externalMatrix){
         String result = "";
        for (int[] line: state ) {
            result += Arrays.toString(line);
            result += System.lineSeparator();
        }
    }
    private int[][] getState() {
        return state;
    }



}

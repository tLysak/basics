package com.brainacad.lpyavka.lesson5.oop;

import java.util.Arrays;

public class Matrix {
    private int[][] state;

    public void multiply(final Matrix externalMatrix) {
        //TODO implement
    }

    public void sum(final Matrix externalMatrix) {

        if (null == externalMatrix || null == externalMatrix.getState()) {
            return;
        }
        int[][] external = externalMatrix.getState();
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state.length; j++) {
                state[i][j] = state[i][j] + external[i][j];
            }
        }
    }

    public String getStringState() {
        String result = "";
        for (int[] line : state) {
            result += Arrays.toString(line);
            result += System.lineSeparator();
        }
        return result;
    }

    public int[][] getState() {
        return state;
    }

    public void setState(int[][] state) {
        this.state = state;
    }
}


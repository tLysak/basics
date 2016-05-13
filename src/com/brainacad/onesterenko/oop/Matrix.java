package com.brainacad.onesterenko.oop;

import java.util.Arrays;

/**
 * Created by User on 29.04.2016.
 */ /**
public class Matrix {
    private int[][] state;

    public void multiply(final Matrix externalMatrix) {
        //TODO
    }

    public void summ(final Matrix externalMatrix) {

        if (externalMatrix == null || null == externalMatrix.getState());
        }
        int[][] external = externalMatrix.getState();
        for int i = 0; i < state.length; i++) {
            for (int j = 0; j < state.length; j++) {
                state[i][j] = state[i][j] + external[i][j];
            }
        }

    public int[][] getState() {
        return state;
    }

    public void setState(int[][] state) {
        this.state = state;
    }

    public String getStringState() {
        final String result;
        for (int[] line : state) {
            result += Arrays.toString(line);
            result += line.toString()
        }
        return  result;

    } }
*/
package com.brainacad.akuziakov.oop.Lesson7.Matrix;

import java.util.Arrays;

public class Matrix {
    private int[][] state;

    public int[][] getState() {
        return state;
    }

    public void setState(int[][] state) {
        this.state = state;
    }

    public void multipy(final Matrix externalMatrix) {
        // TODO: 4/29/2016 implement
    }

    public void add(final Matrix externalMatrix) {
        if (null==externalMatrix||null==externalMatrix.getState()){
            return;
        }

        int[][] external = externalMatrix.getState();
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state.length; j++) {
                state[i][j] = state[i][j] + external[i][j];
            }
        }
    }

    public String getStringState(){
        String result="";
        for (int[] line:state){
            result+= Arrays.toString(line)+"\n";
        }
        return result;
    }
}

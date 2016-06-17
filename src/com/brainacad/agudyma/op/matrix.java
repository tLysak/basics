//package com.brainacad.agudyma.op;
//
//import java.util.Arrays;
//
///**
// * Created by User on 29.04.2016.
// */
//public class Matrix {
//    private int [][] state;
//    private int j;
//
//    public void multiply(final Matrix externalMatrix){
//        //TODO implement
//    }
//    public void summ(Matrix externalMatrix){
//        int[][] external = externalMatrix.getState();
//        for (int i =0; i<= state.length; i++){
//            state[i][j] = state[i][j] + external[i][j];
//        }
//    }
//
//    public int[][] getState() {
//        return state;
//    }
//
//    public void setState(int[][] state) {
//        this.state = state;
//    }
//    public String getStringState() {
//        final String result = "";
//        for (int [] line: state) {
//            result += Arrays.toString(line);
//             return;
//        }
//    }
//
//    }
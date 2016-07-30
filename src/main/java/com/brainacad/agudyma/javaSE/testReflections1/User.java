package com.brainacad.agudyma.javaSE.testReflections1;

/**
 * Created by User on 7/27/2016.
 */
public class User {

    private int a;
    private int b;
    public int c;
    int d;

    public int resultSumAB (int a, int b ){
        int resultSum = getA()+getB();
        return resultSum;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

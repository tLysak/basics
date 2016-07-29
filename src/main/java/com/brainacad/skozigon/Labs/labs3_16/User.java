package com.brainacad.skozigon.Labs.labs3_16;

/**
 * Created by skozigon on 27.07.2016.
 */
public class User {
    public int a, c;
    private int b, d;

    public User(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public User(int a, int c, int b, int d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }

    public User(int a) {
        this.a = a;
    }

    public User() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

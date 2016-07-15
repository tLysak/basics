package com.brainacad.akuziakov.lesson17.testgenerics1;

public class MyTuple<A, B, C> {
    private A a;
    private B b;
    private C c;

    public MyTuple(final A a, final B b, final C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}

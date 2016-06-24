package com.brainacad.akuziakov.lesson21.lab_2_18_4;

public class Main {

    public static void main(String[] args) {

        Dog a = new Puppy();
//        foo(a);
        foo(null);
    }

    static void foo(final Animal a) {
        System.out.println("Animal");
    }

    static void foo(final Dog d) {
        System.out.println(d.getClass().getCanonicalName());
    }

    static void foo(final Puppy p) {
        System.out.println(p.getClass().getCanonicalName());
    }
}

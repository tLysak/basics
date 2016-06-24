package com.brainacad.akuziakov.lesson21.lab_2_18_1;

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        foo(a);

        System.out.println(a.toString());
    }

    static void foo(Animal a) {
        System.out.println("Animal");
    }

    private static void foo(Dog d) {
        System.out.println("Dog");
    }
}

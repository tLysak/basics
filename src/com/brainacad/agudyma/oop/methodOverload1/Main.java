package com.brainacad.agudyma.oop.methodOverload1;

/**
 * Created by User on 17.06.2016.
 */
public class Main {
    public static void foo(Animal a){

        System.out.println("Animal");

    }

    public static void foo(Dog d){
        System.out.println("Dog");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        foo(a);
        foo(d);
    }
}

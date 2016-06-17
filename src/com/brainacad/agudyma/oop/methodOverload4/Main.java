package com.brainacad.agudyma.oop.methodOverload4;

/**
 * Created by User on 17.06.2016.
 */
public class Main {



    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Puppy p = new Puppy();
        Animal.foo(a);
        Dog.foo(d);
        Puppy.foo(p);



    }
}

package com.brainacad.skozigon.Labs.labs2_16.labs2_16_1;

/**
 * Created by skozigon on 17.06.2016.
 */
public class Main {

    static void foo(Animal a){
        System.out.println("Animal");
    }

    static void foo(Dog d){
        System.out.println("Dog");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        foo(animal);
        foo(dog);

        animal = new Dog();
        foo(animal);


    }
}

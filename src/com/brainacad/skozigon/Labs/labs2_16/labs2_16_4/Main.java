package com.brainacad.skozigon.Labs.labs2_16.labs2_16_4;

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

    static void foo(Puppy p){
        System.out.println("Puppy");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        foo(animal);
        foo(dog);
        foo(puppy);

        puppy = null;

        foo(puppy);



    }
}

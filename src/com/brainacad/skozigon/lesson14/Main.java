package com.brainacad.skozigon.lesson14;

/**
 * Created by skozigon on 27.05.2016.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Human h1 = new Human();
        try {
            h1.setAge(-1);
        } catch (Exception e) {
            System.out.println("Incorrect age. Enter new age");
            h1.setAge(3);
            System.out.println(h1.getAge());
            return;

        }
        finally {
            h1.setAge(2);
            System.out.printf("____");
        }
        System.out.println(h1.getAge());

    }

}

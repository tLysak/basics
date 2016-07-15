package com.brainacad.akuziakov.lesson14.ageexception;

public class MainApp {

    public static void main(String[] args) {
        Human human = null;
        Human human1 = null;
        try {
            human = new Human(9);
            human1 = new Human(-1);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            human.setAge(9);
        } catch (AgeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            human1.setAge(-1);
        } catch (AgeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

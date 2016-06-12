package com.brainacad.vmarch.lesson8.incheritance;

public class Comp {
    public static void main(String[] args) {
        final Computer computer1 = new Computer();
        final Computer computer2 = new Computer();
        if (computer1 == computer2)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println(computer1.equals(computer2));
    }
}


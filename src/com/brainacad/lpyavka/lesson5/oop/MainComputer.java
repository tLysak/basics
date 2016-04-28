package com.brainacad.lpyavka.lesson5.oop;

public class MainComputer {

    public static void main(String[] args) {

        Computer[] computer = new Computer[10];
        float index = 11;
        for (int i = 0; i < computer.length; i++) {
            computer[i] = new Computer();

            computer[i].setPrice(index);
            System.out.println("Computer N " + (i + 1)
                    + " costs " + computer[i].getPrice());
            index *= 0.1;
        }
    }
}

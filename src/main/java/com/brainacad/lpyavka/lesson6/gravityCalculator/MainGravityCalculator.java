package com.brainacad.lpyavka.lesson6.gravityCalculator;

public class MainGravityCalculator {
    public static void main(String[] args) {
        GravityCalculator gravityCalculator = new GravityCalculator();
        int time = 10;
        System.out.println("The object's position after " + time + " seconds is "
                + gravityCalculator.calcDist(10) + " m.");
    }
}

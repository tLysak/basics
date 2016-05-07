package com.brainacad.lpyavka.lesson6;

public class GravityCalculator {
    static final double ACCELERATION = -9.81;
    private double initialVelocity = 10;
    private double initialPosition = 10;

    public double calcDist(double t) {
        double finalPosition = 0.5 * Math.pow((ACCELERATION * t), 2) + initialVelocity * t + initialPosition;
        return finalPosition;
    }
}

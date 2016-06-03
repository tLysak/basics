package com.brainacad.vmarch.lesson6.gravitycalculator;

import static java.lang.Math.pow;

public class MainGravityCalculator {
    private static final double ACCELERATION = 9.81;

    private static double a = ACCELERATION;
    private static double vi = 0.0;
    private static double xi = 0.0;

    public static double calcDist(double t) {

        return 0.5 * a * pow(t, 2) + vi * t + xi;
    }


}

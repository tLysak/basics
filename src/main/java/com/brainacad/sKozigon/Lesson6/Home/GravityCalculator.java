package com.brainacad.skozigon.Lesson6.Home;

import java.util.Scanner;

/**
 * Created by skozigon on 11.05.2016.
 */
public class GravityCalculator {

    private final double A = 9.81;

    float vi = 0;
    float xi = 0;



    public double calckDist(double t){
        return (A*t*t/2 + vi*t + xi);
    }

    public static void main(String[] args) {
        double time;
        System.out.println("Enter time(sec): ");
        Scanner sc = new Scanner(System.in);
        time = sc.nextDouble();
        
        GravityCalculator grav = new GravityCalculator();

        System.out.println("Distance = " + grav.calckDist(time)+ "meters");
        
    }
}

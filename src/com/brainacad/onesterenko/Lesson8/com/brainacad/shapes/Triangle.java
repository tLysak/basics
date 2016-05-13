package com.brainacad.onesterenko.Lesson8.com.brainacad.shapes;

import static java.lang.Math.sqrt;

/**
 * Created by User on 13.05.2016.
 */
 public class Triangle {

     private double sideOne;
     private double sideTwo;
     private double sideThree;
     private double square;
    private double p= (sideOne+sideTwo+sideThree)/2;
     private double getSideOne() {
         return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public Triangle ( double sideOne,  double sideTwo,  double sideThree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;

    }
    public double getSquare(){
        square = sqrt((p-sideOne)*(p-sideTwo)*(p-sideThree));
        return square;
    }
}


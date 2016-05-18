package com.brainacad.onesterenko.lesson10.shapes;

import javax.naming.Name;

/**
 * In class Circle override  calcArea() method which must return area of circle
 (by the formula:  area  = PI*radius2).
 In class Circle override the toString() method. It must return string which contain name of shape,
 color and radius of circle. Example:
 “This is Circle, color: GREEN, radius=22”
 Add to class Circle constructor with color and radius arguments.
 */
public class Circle extends MyShape {

   double radius;

    Circle() {
        radius = 10;
        color = "GREEN";
    }

   String circle = "Circle";



    @Override
    public double calcArea (){
        this.area =  radius*radius*3.14;
        return this.area;
    }


    @Override
    public String toString (){
       String data = "This is " + circle + ", color: " + color + " Shape area is " + calcArea();
       return  data;
    }

}

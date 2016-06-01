package com.brainacad.onesterenko.lesson10.shapes;

import java.util.StringTokenizer;

/**
 * Rewrite the Rectangle class to add new public static method called parseRectangle (String) which returns new object
 as Rectangle type based on string passed as argument.
 Example of possible strings:
 “Rectangle:RED:5,6”;
 “Rectangle:RED:10,20”;
 “Rectangle:RED:33,44”;
 In parseRectangle() method you must determine and extract numeric values form string and parse it to double type
 (using Double.parseDouble() method), to use it as arguments to create Rectangle object and pass it to return statement;
 Provide the same changes (add parse…() method) in Triangle and Circle classes.
 Rewrite the Shape.parseShape(String) method in Shape class to use invocation of particular parse…() method for
 each shape object type (in switch statement).
 For example:
 Rectangle.parseRectangle (String) method to parse string in case of Rectangle object.
 Execute program.

 */
public class Triangle extends MyShape {
     double a;
     double b;
     double c;
     double s;
    String triangle = "triangle";

    Triangle( ) {
        color = "BLACK";
        a=5;
        b=5;
        c=5;

             }
    @Override
    public double calcArea (){
        double s = (a+b+c)/2;
        this.area = Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
        return this.area;
    }

    @Override
    public String toString (){
        return "This is TRIANGLE" +   ", color: " + color + " Shape area is " + calcArea();
           }
    /**
     * Rewrite the Rectangle class to add new public static method called parseRectangle (String) which returns new object
     as Rectangle type based on string passed as argument.
     Example of possible strings:
     “Rectangle:RED:5,6”;
     “Rectangle:RED:10,20”;
     “Rectangle:RED:33,44”;
     In parseRectangle() method you must determine and extract numeric values form string and parse it to double type
     (using Double.parseDouble() method), to use it as arguments to create Rectangle object and pass it to return statement;
     Provide the same changes (add parse…() method) in Triangle and Circle classes.
     Rewrite the Shape.parseShape(String) method in Shape class to use invocation of particular parse…() method for
     each shape object type (in switch statement).
     For example:
     Rectangle.parseRectangle (String) method to parse string in case of Rectangle object.
     Execute program.
     */
    public Triangle parseTriangle ( String data){
        StringTokenizer tokenize = new StringTokenizer(data);
        while (tokenize.hasMoreTokens()) {
            System.out.println(tokenize.nextToken());
        }
      a=  Double.parseDouble(data);
      b =  Double.parseDouble(data);
      c=  Double.parseDouble(data);
        return new Triangle();

    }

}

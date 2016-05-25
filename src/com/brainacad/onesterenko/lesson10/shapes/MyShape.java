package com.brainacad.onesterenko.lesson10.shapes;

/**
 * Rewrite the class Shape to add new public static method called parseShape(String) which returns new object as
 * Shape (one of shapes, such as triangle, rectangle and so on) based on string passed as argument.
 Example of possible strings:
 “Rectangle:RED:10,20”;
 “Triangle:GREEN:9,7,12”;
 “Circle:BLACK:10”.
 In parseShape() method you must provide following steps:
 Determine type of shape object (using first word of string and switch statement);
 Determine and extract numeric values form string and parse it to double type (using Double.parseDouble() method),
 to use it as arguments to create particular Shape object.
 Create particular Shape object and pass it to return statement;
 Add code to main() method in class Main, which creates one Rectangle, one Triangle and one Circle using Shape.parseShape
 (String) method.
 Rewrite the Rectangle class to add new public static method called parseRectangle (String) which returns new object
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
public class MyShape {
    String color;
    double area;
    public double calcArea  (){
        return area;
    }

    public static MyShape  parseShape (String input){

       return new MyShape();
    }
}

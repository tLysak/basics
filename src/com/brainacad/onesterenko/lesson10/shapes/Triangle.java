package com.brainacad.onesterenko.lesson10.shapes;

/**
 * Add to project  “MyShapes” a new class “Triangle” which is a subclass of Shape.
 Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
 In class Triangle override  calcArea() method which must return area of triangle
 (By the formula:  area  =  , where  ).
 In class Triangle override the toString() method. It must return string which contain name of shape,
 color and a, b, c sides of triangle. Example:
 “This is Triangle, color: BLACK, a=5, b=5, c=5”
 Add to class Triangle constructor with color, a, b and c arguments.

 Then add to class Main code to create one Triangle object and print it name, color, a, b, c sides
 of triangle to console. Then invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Triangle, color: BLACK, a=5, b=5, c=5”
 “Shape area is: 10.825”

 */
public class Triangle extends MyShape {
     double a;
     double b;
     double c;
     double s = (a+b+c)/2;

    Triangle() {
        color = "BLACK";
        a=5;
        b=5;
        c=5;
    }
    @Override
    public double calcArea (){
        this.area = Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
        return this.area;}

    @Override
    public String toString (){
        String data = "This is TRIANGLE" +   ", color: " + color + " Shape area is " + calcArea()+ "  "+a + b + c;
        return  data;

    }

}

package com.brainacad.agudyma.lesson10.op.brainacad.Shapes.MyShapes;

/**
 * Created by Sidhartha on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(11, "red");
        System.out.println("This is Circle " + circle1);

        Rectangle rectangle1 = new Rectangle(11, 20, "green");
        System.out.println("This is " +rectangle1.color+ " Rectangle " +"width= "+ rectangle1.width+ " height= "+rectangle1.height);
        System.out.println(rectangle1);

        Triangle triangle1 = new Triangle(10,20,30,"blue");
        System.out.println("This is " + triangle1.color + " Triangle " + " side A "+triangle1.sideA+", side B " + triangle1.sideB+ ", side C "+ triangle1.sideC);
        System.out.println(triangle1.calcArea());
    }

}

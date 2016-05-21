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

    }

}

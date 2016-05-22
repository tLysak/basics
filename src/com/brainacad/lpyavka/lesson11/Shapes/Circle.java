package com.brainacad.lpyavka.lesson11.Shapes;

public class Circle extends Shape {
    String color;
    double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    double calcArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle has ");
        sb.append("color='").append(color).append('\'');
        sb.append(" and radius=").append(radius);
        sb.append('.');
        return sb.toString();
    }
}

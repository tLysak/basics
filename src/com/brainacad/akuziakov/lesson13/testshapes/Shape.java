package com.brainacad.akuziakov.lesson13.testshapes;

import java.util.DoubleSummaryStatistics;

public class Shape {

    private final String shapeColor;

    protected String getShapeColor() {
        return shapeColor;
    }

    public Shape(final String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Shape, color is: %s", shapeColor);
    }

    public Shape parseShape(final String shape) {

        Shape tmpShape = null;

        int startIndex = shape.indexOf(':');
        int nextIndex = shape.indexOf(':', startIndex);

        String shapeColor = shape.substring(startIndex, nextIndex - 1);
        String[] strShapeDimensions = shape.substring(nextIndex, shape.length() - 1).split(",");
        Double[] shapeDimensions = new Double[strShapeDimensions.length];

        for (int i = 0; i < strShapeDimensions.length; i++) {
            shapeDimensions[i] = Double.parseDouble(strShapeDimensions[i]);
        }


        switch (shape.toLowerCase().charAt(0)) {
            case 'c':
                tmpShape = new Circle(shapeColor, shapeDimensions[0]);
                break;
            case 't':
                tmpShape = new Triangle(shapeColor, shapeDimensions[0], shapeDimensions[1], shapeDimensions[2]);
                break;
            case 'r':
                tmpShape = new Rectangle(shapeColor, shapeDimensions[0], shapeDimensions[1]);
        }

        return tmpShape;
    }
}

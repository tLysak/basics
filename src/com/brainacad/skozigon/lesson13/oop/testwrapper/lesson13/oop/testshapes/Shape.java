package com.brainacad.skozigon.lesson13.oop.testwrapper.lesson13.oop.testshapes;

import java.util.StringTokenizer;

/**
 * Created by skozigon on 25.05.2016.
 */
abstract class Shape implements Drawable{
    private String shapeColor = "blue";
    Shape(){

    }

    Shape(String color){
        this.shapeColor = color;
    }

    abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Shape, color is:" + shapeColor;
    }
//    public parseShape(String string){
//        String delim = ":";
//        StringTokenizer st = new StringTokenizer(string, delim);
//        while (st.hasMoreTokens()){
//
//        }


    }





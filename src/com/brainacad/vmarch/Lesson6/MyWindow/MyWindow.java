package com.brainacad.vmarch.lesson6.mywindow;

public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = 1.3;
        this.height = 5.4;
        this.numberOfGlass = 6;
        this.color = "red";
        this.isOpen = true;
    }
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height) {this(width, height, 4, "grey", true);}
    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = "purple";
        this.isOpen = true;
    }

    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(1.1, 1.2, 13, "red", true);
        MyWindow window2 = new MyWindow(1.7, 1.7, 3, "blue", false);
        MyWindow window3 = new MyWindow(5.4, 4.3, 1, "pink", true);
        MyWindow window4 = new MyWindow(1.0, 8.5, 43, "white", false);
        MyWindow window5 = new MyWindow(6.7, 2.4, 5, "yellow", true);
        MyWindow window6 = new MyWindow();

        MyWindow array[] = {new MyWindow(),
                            new MyWindow(1.1, 1.2, 13),
                            new MyWindow(1.0, 8.5, 4, "white", true),
                            new MyWindow(3.5, 1.5)};

        for (MyWindow window : array) {
            window.printFields();

        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.println("Window has \n  width: " + width+ ",\n  height: "+height+ ",\n  numberOfGlass: "
                +numberOfGlass+ ",\n  color: " + color +",\n  isOpen: "+ isOpen +"\n-------------");
    }
}

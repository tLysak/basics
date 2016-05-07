package com.brainacad.lpyavka.lesson6;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        this.width = 1.4;
        this.height = 1.8;
        this.numberOfGlass = 2;
        this.color = "Silver";
        this.isOpen = true;
    }

    public MyWindow(double width, double height) {
        this(width, height, 5, "Red", false);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "Brown", true);
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

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.println("Window with: " + "width " + this.width + ", height " + this.height + ", number of glasses "
                + this.numberOfGlass + ", color " + this.color + ", is open?- " + this.isOpen + ".");
    }
}

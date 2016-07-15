package com.brainacad.skozigon.Lesson6.Home;


class MyWindow {
    double width, height;
    int numderOfGlass;
    String color;
    boolean isOpen;


    MyWindow() {
        this(10.1, 5.5, 5, "pink", false);
//        System.out.println("Window parameters : \nheight = " + height + "\nwigth = " + width + "\nnumber of glass = " + numderOfGlass
//                + "\ncolor = " + color + "\nis open = " + isOpen + "\n\n");
    }

    MyWindow(double width, double height) {
        this(width, height, 1, "orange", true);
//        System.out.println("Window parameters : \nheight = " + height + "\nwigth = " + width + "\nnumber of glass = " + numderOfGlass
//                + "\ncolor = " + color + "\nis open = " + isOpen + "\n\n");
    }

    MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "blue", false);
//        System.out.println("Window parameters : \nheight = " + height + "\nwigth = " + width + "\nnumber of glass = " + numderOfGlass
//                + "\ncolor = " + color + "\nis open = " + isOpen + "\n\n");
    }


    public MyWindow(double w, double h, int n, String c, boolean is) {
        width = w;
        height = h;
        numderOfGlass = n;
        color = c;
        isOpen = is;
    }

    public void printFields() {
        System.out.println("Window parameters : \nnwigth = " + width + "\nheight = " + height + "\nnumber of glass = " + numderOfGlass
                + "\ncolor = " + color + "\nis open = " + isOpen + "\n\n");
    }

}


public class Windows {

    public static void main(String[] args) {

        MyWindow[] mass = new MyWindow[]{new MyWindow(), new MyWindow(2.5, 3.3, 2, "white", true), new MyWindow(2.8, 3.5), new MyWindow(2.1, 2.2, 2)};
        for (MyWindow el: mass
             ) {
                el.printFields();
        }

    }
    

}

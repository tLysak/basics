package com.brainacad.lpyavka.lesson6;

public class MainWindow {
    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(1.2, 1.4, 2, "White", true);
        MyWindow window2 = new MyWindow(1.3, 1.5, 1, "Grey", false);
        MyWindow window3 = new MyWindow(2.2, 2.0, 3, "Purple", true);
        MyWindow window4 = new MyWindow(2.0, 1.4, 1, "Green", false);
        MyWindow window5 = new MyWindow(1.2, 2.5, 2, "Blue", true);
        MyWindow window6 = new MyWindow(1.9, 2.5);
        MyWindow window7 = new MyWindow(2.3, 2, 3);

        MyWindow[] array = {new MyWindow(), new MyWindow(2.0, 1.4), new MyWindow(1.0, 1.0, 2, "Gold", true ),
                new MyWindow(2.1, 1.5, 2)};

        for (MyWindow window : array) {
            window.printFields();
        }
    }
}

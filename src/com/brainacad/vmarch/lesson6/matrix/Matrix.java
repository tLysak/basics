package com.brainacad.vmarch.lesson6.matrix;

public class Matrix {
    public void init(int height, int width, int... values) {

        int valueOfElements = height * width;

        if (values.length != valueOfElements) {
            System.out.println("\nAhtung!!! Your matrix is abnormal. \nValues is: "
                    + values.length + "\nValue Of Elements is: " + valueOfElements);
        } else {
            System.out.println("\nWonderful!! You has done the impossible. \nValues is: "
                    + values.length + "\nValue Of Elements is: " + valueOfElements);
        }
    }
}

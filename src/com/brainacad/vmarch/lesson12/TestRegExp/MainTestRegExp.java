package com.brainacad.vmarch.lesson12.TestRegExp;


public class MainTestRegExp {

    public static void main(String[] args) {

        String[] str = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        for (String arr : str) {

            TestRegExp.checkPersonWithRegExp(arr);

        }
    }
}

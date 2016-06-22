package com.brainacad.skozigon.Labs.labs2_15.testmap1;

import java.util.Scanner;

/**
 * Created by skozigon on 17.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWorld("cat", "кот");
        myTranslator.addNewWorld("mouse", "мышь");
        myTranslator.addNewWorld("caught", "поймал");

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        myTranslator.translate(string);

    }
}

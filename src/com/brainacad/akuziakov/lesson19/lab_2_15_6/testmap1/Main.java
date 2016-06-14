package com.brainacad.akuziakov.lesson19.lab_2_15_6.testmap1;

public class Main {

    public static void main(String[] args) {

        MyTranslator<String, String> myTranslator = new MyTranslator<>();

        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");

        System.out.printf("%s переводится как %s\n", "cat", myTranslator.translate("cat"));
        System.out.printf("%s переводится как %s\n", "mouse", myTranslator.translate("mouse"));
    }
}

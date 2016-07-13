package com.brainacad.agudyma.oop.testMap;


import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Sidhartha on 26.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        String translateInput = scanner.nextLine();

        MyTranslator translator = new MyTranslator();


        translator.addNewWord("cat", "кот");
        translator.addNewWord("eats","ест");
        translator.addNewWord("mouse","мышь");

        translator.setTranslateInput(translateInput);

        translator.translateRu();



    }

}

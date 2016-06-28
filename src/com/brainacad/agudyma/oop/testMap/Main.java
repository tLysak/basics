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

        String myStr = translateInput;
        StringTokenizer stringTokenizer = new StringTokenizer(myStr);
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());

        }
// to do words separation of line
        MyTranslator translator = new MyTranslator();
        translator.setTranslateInput(translateInput);

        translator.addNewWord("cat", "кот");
        translator.addNewWord("eats","ест");
        translator.addNewWord("mouse","мышь");
        translator.translateRu();






    }

}

package com.brainacad.onesterenko.lesson18.testMap1;

import java.util.HashMap;

/**
 * Create a class MyTranslator with private field “dictionary” of HashMap<String,String> type.
 Add method addNewWord(String en, String ru), which add to “dictionary” new word in two languages.
 Add new method translate(String en) which take some string in English language and return this test translated
 to Russian language as value of String type.
 Create a class Main with a main( ) method.
 Add to method main() code creates instance of MyTranslator. Add code to fill MyTranslator with few en-rus words
 pair by invoking addNewWord method.
 For example:
 “сat”, “кот”
 “mouse”, “мышь”
 …
 Add code to read string from console and pass it into translate method. Print result to console.
 Execute the program.
 The program output must be like next example:
 cat caught mouse
 кот поймал мышь
 */
public class MyTranslator {
    private HashMap<String,String>  dictionary;
    public MyTranslator() {
        this.dictionary = new HashMap<>();
    }

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(final String en) {
        return dictionary.get(en);
    }



}

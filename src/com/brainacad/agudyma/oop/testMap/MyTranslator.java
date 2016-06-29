package com.brainacad.agudyma.oop.testMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by Sidhartha on 26.06.2016.
 */
public class MyTranslator {

    public String translateInput;
    private HashMap<String, String> translator = new HashMap<>();

    public void setTranslateInput(String translateInput) {
        this.translateInput = translateInput;
    }

    public void  addNewWord(String en, String ru) {

        translator.put(en,ru);

    }

    public void translateRu() {

        String[] parts = translateInput.split(" ");
        for (String word:parts) {
            {
                String outputLine = translator.get(word);
                System.out.print(outputLine + " ");
            }
        }
    }
}


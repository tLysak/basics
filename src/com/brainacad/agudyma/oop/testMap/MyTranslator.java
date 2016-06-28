package com.brainacad.agudyma.oop.testMap;

import java.util.HashMap;

/**
 * Created by Sidhartha on 26.06.2016.
 */
public class MyTranslator {
    public String en;
    public String ru;
    public String translateInput;
    private HashMap<String, String> translator = new HashMap<>();

    public void setTranslateInput(String translateInput) {
        this.translateInput = translateInput;
    }

    public String getTranslateInput() {
        return translateInput;
    }

    public void  addNewWord(String en, String ru) {

        translator.put(en,ru);

    }



    public void translateRu() {
        String  ru = translator.get(getTranslateInput());
        System.out.println(ru);


    }
}


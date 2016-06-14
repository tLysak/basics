package com.brainacad.akuziakov.lesson19.lab_2_15_6.testmap1;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator<K, V> {

    private final Map<K, V> dictionary;

    public MyTranslator() {
        this.dictionary = new HashMap<>();
    }

    public void addNewWord(final K en, final V ru) {
        dictionary.put(en, ru);
    }

    public V translate(final K en) {
        return dictionary.get(en);
    }
}

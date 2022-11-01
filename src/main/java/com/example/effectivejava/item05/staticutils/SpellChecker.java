package com.example.effectivejava.item05.staticutils;

import com.example.effectivejava.item05.DefaultDictionary;
import com.example.effectivejava.item05.Dictionary;

import java.util.List;

public class SpellChecker {
    private static final Dictionary dictionary = new DefaultDictionary();

    public SpellChecker() {
    }

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String type) {
        return dictionary.closeWordsTo(type);
    }
}

package com.example.effectivejava.item05.factorymethod;

import com.example.effectivejava.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String type) {
        return dictionary.closeWordsTo(type);
    }
}

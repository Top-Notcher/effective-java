package com.example.effectivejava.item05.dependencyinjection;

import com.example.effectivejava.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {
    @Test
    void isValid() {
//        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        SpellChecker spellChecker = new SpellChecker(DictionaryFactory::get);
        spellChecker.isValid("test");
    }
}
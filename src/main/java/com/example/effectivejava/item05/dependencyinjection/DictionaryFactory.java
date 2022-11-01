package com.example.effectivejava.item05.dependencyinjection;

import com.example.effectivejava.item05.DefaultDictionary;
import com.example.effectivejava.item05.Dictionary;

public class DictionaryFactory {
    public static Dictionary get() {
        return new DefaultDictionary();
    }
}

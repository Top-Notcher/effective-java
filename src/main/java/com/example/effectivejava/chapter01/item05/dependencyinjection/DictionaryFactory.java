package com.example.effectivejava.chapter01.item05.dependencyinjection;

import com.example.effectivejava.chapter01.item05.DefaultDictionary;
import com.example.effectivejava.chapter01.item05.Dictionary;

public class DictionaryFactory {
    public static Dictionary get() {
        return new DefaultDictionary();
    }
}

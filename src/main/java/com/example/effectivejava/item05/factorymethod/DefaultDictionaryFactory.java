package com.example.effectivejava.item05.factorymethod;

import com.example.effectivejava.item05.DefaultDictionary;
import com.example.effectivejava.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}

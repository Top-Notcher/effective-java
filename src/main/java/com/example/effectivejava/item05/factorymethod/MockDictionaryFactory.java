package com.example.effectivejava.item05.factorymethod;

import com.example.effectivejava.item05.DefaultDictionary;
import com.example.effectivejava.item05.Dictionary;
import com.example.effectivejava.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}

package com.example.effectivejava.item05.springIoc;

import com.example.effectivejava.item05.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringDictionary implements Dictionary {
    @Override
    public boolean contains(String word) {
        System.out.println("contains " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String type) {
        return null;
    }
}

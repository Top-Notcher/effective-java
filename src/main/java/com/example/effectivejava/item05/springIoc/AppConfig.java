package com.example.effectivejava.item05.springIoc;

import com.example.effectivejava.item05.Dictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {
//
//    @Bean
//    public SpellChecker spellChecker(Dictionary dictionary) {
//        return new SpellChecker(dictionary);
//    }
//
//    @Bean
//    public Dictionary dictionary() {
//        return new SpringDictionary();
//    }
}

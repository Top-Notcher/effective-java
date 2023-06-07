package com.example.effectivejava.chapter01.item05.springIoc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

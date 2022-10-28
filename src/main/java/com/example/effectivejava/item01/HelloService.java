package com.example.effectivejava.item01;

public interface HelloService {
    String Hello();

    static HelloService of(String lang){
        if(lang.equals("ko")){
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}

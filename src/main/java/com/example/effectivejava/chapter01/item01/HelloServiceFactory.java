package com.example.effectivejava.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

//    public static HelloService of(String lang){
//        if(lang.equals("ko")){
//            return new KoreanHelloService();
//        }else{
//            return new EnglishHelloService();
//        }
//    }

    public static void main(String[] args) {
        // 자바가 기본으로 제공해주는 정적팩터리메서드
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        // load가 등록되어있는 구현체를 다 가지고 온다.
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> {
            System.out.println(h.Hello());
        });

    }
}

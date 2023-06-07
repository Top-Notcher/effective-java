package com.example.effectivejava.chapter01.item01;

public interface HelloService {
    String Hello();

    static HelloService of(String lang){
        if(lang.equals("ko")){
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    static String hi(){
        prepareMessage();
        return "hi";
    }
    default String bye() {  // 기본메서드 : 이 인터페이스를 구현한 클래스들의 인스턴스들이 모두 사용가능
        return "bye";
    }

    static private void prepareMessage() {

    }
}

package com.example.effectivejava.item03.functionalinterface;

@FunctionalInterface
public interface MyFunction {
    // 함수형 인터페이스는 선언부가 1개만 있어야 한다.
    String valueOf(Integer integer);

    static String hello() {
        return "hello";
    }
}

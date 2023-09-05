package com.example.effectivejava.chapter04.item21;

public interface MarketInterface {
    default void hello() {
        System.out.println("hello interface");
    }
}

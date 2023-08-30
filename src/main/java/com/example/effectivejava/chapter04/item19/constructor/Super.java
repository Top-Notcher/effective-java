package com.example.effectivejava.chapter04.item19.constructor;

// 재정의 가능 메서드를 호출하는 생성자 - 따라 하지 말 것! (115쪽)
public class Super {
    public Super() {
        overrideMe();
    }

    public void overrideMe() {  // public 즉 재정의 가능하면 안된다.

    }
}

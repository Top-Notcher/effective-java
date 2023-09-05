package com.example.effectivejava.chapter04.item21;

public class SubClass extends SuperClass implements MarketInterface {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.hello();   // SuperClass의 hello는 private, MarketInterface의 hello는 디폴트 메서드
                            // 항상 class가 메서드를 이기게 되어 있다.
                            // 런타임 오류 발생!
    }
}

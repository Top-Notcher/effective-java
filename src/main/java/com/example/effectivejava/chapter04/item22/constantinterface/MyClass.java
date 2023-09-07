package com.example.effectivejava.chapter04.item22.constantinterface;

public class MyClass implements PhysicalConstants{
    public static void main(String[] args) {
        System.out.println(PhysicalConstants.ELECTRON_MASS);
        System.out.println(BOLTZMANN_CONTANT);  // 상속 시 위와 같이 사용 가능 - 인터페이스의 의도(타입 정의) 오염
    }
}

package com.example.effectivejava.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class LambdaExample {
    
    private int value = 10;
    
    private Runnable instanceLambda = () -> {   // 캡처링을 하냐 안하냐에 따라 참조여부가 달라진다.
        System.out.println(value);
    };

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        Field[] declaredFields = example.instanceLambda.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }
    }
}

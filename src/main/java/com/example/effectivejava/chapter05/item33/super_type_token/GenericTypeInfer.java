package com.example.effectivejava.chapter05.item33.super_type_token;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericTypeInfer {

    static class Super<T> {
        T value;
    }

//    static class Sub extends Super<String> {    // 상속받는 경우에는 상속정보가 남는다.
//
//    }


    public static void main(String[] args) throws NoSuchFieldException {
        Super<String> stringSuper = new Super<>();
        System.out.println(stringSuper.getClass().getDeclaredField("value").getType());   //object

//        Sub sub = new Sub();
//        Type type = Sub.class.getGenericSuperclass();
        Type type = (new Super<String>(){}).getClass().getGenericSuperclass();
        ParameterizedType ptype = (ParameterizedType) type;
        System.out.println(ptype.getActualTypeArguments()[0]);  // string

    }
}

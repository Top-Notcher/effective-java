package com.example.effectivejava.chapter05.item28.safevarargs;

import java.util.List;

public class SafeVaragsExample {

//    @SafeVarargs    // Not actually safe!
    static void notSafe(List<String>... stringLists) {  // List<String>[] 이 가능하지만 전달받은 객체가 오염이 될 수 있다.
        Object[] array = stringLists;       // List<String>... => List[], 그리고 배열은 공변이다.
        List<Integer> tmpList = List.of(42);
        array[0] = tmpList;                 // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0);   // ClassCastException at runtime!
    }

//    @SafeVarargs
    static <T> void safe(T... values) {
        for (T value: values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        SafeVaragsExample.safe("a", "b", "c");
        SafeVaragsExample.notSafe(List.of("a", "b", "c"));
    }
}

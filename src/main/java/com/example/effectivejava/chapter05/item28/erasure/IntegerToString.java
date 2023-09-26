package com.example.effectivejava.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class IntegerToString {

    public static void main(String[] args) {
        // 공변 : 같이 변한다.
        Object[] anything = new String[10];
        anything[0] = 1;    // 잘못된 동작이지만 컴파일러가 잡지 못한다. - 런타임 에러

        // 불공변 : 같이 변하지 않는다.
        List<String> names = new ArrayList<>();
//        List<Object> objects = names; // 컴파일 에러.


        // 제네릭과 배열을 같이 사용할 수 있다면..
//        List<String>[] stringLists = new ArrayList<String>[1];
//        List<Integer> intList = List.of(42);
//        Object[] objects1 = stringLists;
//        objects1[0] = intList;
//        String s = stringLists[0].get(0); // 공변 문제 발생.
//        System.out.println(s);

    }
}

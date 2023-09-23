package com.example.effectivejava.chapter05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("phm");
//        String name = names.get(0);
//        System.out.println(name);

        // 위 코드가 컴파일 되면?!
        List names = new ArrayList<>();
        names.add("phm");
        Object o = names.get(0);
        String name = (String) o;
        System.out.println(name);
    }
}

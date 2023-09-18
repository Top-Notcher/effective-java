package com.example.effectivejava.chapter05.item26.terms;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        // Generic 사용하기 전
        List numbers = new ArrayList();
        numbers.add(10);
        numbers.add("whiteship");

        for (Object number : numbers) {
            System.out.println((Integer)number);
        }

        // Generic 등장 이후
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
//        numbers2.add("whiteship");    // 컴파일 에러

        for (Integer number : numbers2) {
            System.out.println(number);
        }
    }
}

package com.example.effectivejava.chapter05.item31;


import com.example.effectivejava.chapter05.item31.example.Box;
import com.example.effectivejava.chapter05.item31.example.IntegerBox;

import java.util.ArrayList;
import java.util.List;

// 와일드카드 타입을 사용해 재귀적 타입 한정을 다듬었다. (187쪽)
public class RecursiveTypeBound {
    // 코드 30-7 컬렉션에서 최댓값을 반환한다. - 재귀적 타입 한정 사용 (179쪽)
    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if(list.isEmpty()) {
            throw new IllegalArgumentException("빈 리스트");
        }

        E result = null;
        for (E e : list) {
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<IntegerBox> list = new ArrayList<>();
        list.add(new IntegerBox(1, "phm"));
        list.add(new IntegerBox(2, "phm2"));

        System.out.println(max(list));
    }
}

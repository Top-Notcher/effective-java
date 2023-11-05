package com.example.effectivejava.chapter05.item32;

import java.util.ArrayList;
import java.util.List;

// 코드 32-3 제네릭 varargs 매개변수를 안전하게 사용하는 메서드 (195쪽_
public class FlattenWithVarargs {

//    @SuppressWarnings("unchecked")  // 해당 메서드 다 무시
    @SafeVarargs    // 가변인자는 안전하게 사용되고 있다.
    static <T> List<T> flatten(List<? extends T>... lists) {    // 안에 아무것도 안넣고 꺼내서 쓰기만 하면 안전하다. & 밖으로 노출하지마라.
//    static <T> List<T> flatten(List<List<? extends T>> lists) { // 가변인자 대신에 List 사용 -> @SafeVarargs 사용하지 않아도 된다.
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> flatList = flatten(List.of(1,2), List.of(3,4,5), List.of(6,7));
        System.out.println(flatList);
    }
}

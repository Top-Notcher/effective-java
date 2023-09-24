package com.example.effectivejava.chapter05.item28.array_to_list;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// 코드 28-6 배열 기반 Chooser
public class Chooser_Array<T> {
//    private final Object[] choiceList;
//    private final T[] choiceList;
    private final List<T> choiceList;   // 배열이 아니라 리스트 사용

//    public Chooser_Array(Collection choices) {
//        choiceList = choices.toArray();
//    }

    public Chooser_Array(Collection<T> choices) {

//        choiceList = (T[]) choices.toArray();   // 타입 보장을 할 수가 없으므로 warning 발생
        choiceList = new ArrayList<>(choices);
    }

//    public Object choose() {
//        Random rnd = ThreadLocalRandom.current();
//        return choiceList[rnd.nextInt(choiceList.length)];
//    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

        Chooser_Array<Integer> chooser = new Chooser_Array<>(intList);

        for (int i = 0; i < 10; i++) {
//            Number choice = (Number) chooser.choose();  // 범용적으로 쓸 수 있는 클래스의 타입 형변환 문제 발생 -> 제네릭 사용
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }
}

package com.example.effectivejava.chapter04.item18;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// 코드 18-1 잘못된 예 - 상속을 잘못 사용했다! (114쪽)
public class InstrumentedHashSet<E> extends HashSet<E> {
    // 추가된 원소 수
    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());    // 3이 아니라 6이 나온다. 상위 클래스의 구현을 알아야 한다.
    }
}

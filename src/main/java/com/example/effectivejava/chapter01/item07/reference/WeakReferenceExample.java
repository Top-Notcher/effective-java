package com.example.effectivejava.chapter01.item07.reference;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // TODO 거의 없어진다.
        // 약하니깐
        System.out.println(weak.get());
    }
}

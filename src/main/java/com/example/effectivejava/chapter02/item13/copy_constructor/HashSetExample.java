package com.example.effectivejava.chapter02.item13.copy_constructor;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("hyunmin");
        hashSet.add("whiteship");
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);   // 생성자를 통해서 copy
        System.out.println("TreeSet : " + treeSet);
    }
}

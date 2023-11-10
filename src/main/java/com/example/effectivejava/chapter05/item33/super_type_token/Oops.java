package com.example.effectivejava.chapter05.item33.super_type_token;

import java.util.ArrayList;
import java.util.List;

public class Oops {
    static Favorites2 f = new Favorites2();

    static <T> List<T> favoriteList() {
        TypeRef<List<T>> ref = new TypeRef<>() {};
//        System.out.println(ref.getType());  // java.uiil.List<T> 로 나옴 => equals 가 true가 나오게됨.

        List<T> result = f.get(ref);
        if (result == null) {
            result = new ArrayList<T>();
            f.put(ref, result);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = favoriteList();

        List<Integer> li = favoriteList();
        li.add(1);

        for (String s : ls) {
            System.out.println(s); // ClassCastException
        }
    }
}

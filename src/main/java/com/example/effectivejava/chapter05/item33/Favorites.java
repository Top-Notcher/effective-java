package com.example.effectivejava.chapter05.item33;

import java.util.List;

public class Favorites<T> {

    List<T> value;

    public static void main(String[] args) {
        Favorites<String> names = new Favorites<>();
        names.value.add("test");
//        names.value.add(1);   //complie error

        Favorites<Integer> numbers = new Favorites<>();
    }
}

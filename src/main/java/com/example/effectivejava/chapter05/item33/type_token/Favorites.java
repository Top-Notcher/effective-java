package com.example.effectivejava.chapter05.item33.type_token;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

// 서로 다른 타입을 넣을 수 있는 컨테이너
public class Favorites {

    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> clazz, T value) {
        this.map.put(Objects.requireNonNull(clazz), clazz.cast(value)); //cast로 한번더 체크
    }

    public <T> T get(Class<T> clazz) {  //(T)로 형변환한다면 @SuppressWarning("unchecked") 사용
        return clazz.cast(this.map.get(clazz)); // 하지만 Class 에서 체크하는 메서드 존재
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();
//        favorites.put(String.class, 1);   //compile error
        favorites.put(String.class, "test");
        favorites.put(Integer.class, 1);

        String s = favorites.get(String.class);
        Integer integer = favorites.get(Integer.class);


        favorites.put(List.class, List.of(1,2,3));
        favorites.put(List.class, List.of("a", "b", "c"));
        List list = favorites.get(List.class);  // 나중에 저장한 것이 나온다.

//        favorites.put(List<Integer>.class, List.of(1,2,3));       // 이런 클래스는 존재하지 않는다.
//        favorites.put(List<String>.class, List.of("a", "b", "c"));
    }
}

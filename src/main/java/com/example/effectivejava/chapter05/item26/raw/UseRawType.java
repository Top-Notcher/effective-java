package com.example.effectivejava.chapter05.item26.raw;

public class UseRawType<E> {
    private E e;

    public static void main(String[] args) {
//        System.out.println(UseRawType<Integer>.class);  // 사용 불가능
        System.out.println(UseRawType.class);

        UseRawType<String> stringType = new UseRawType<>();

        System.out.println(stringType instanceof UseRawType<String>);   // 컴파일은 되지만 소거 된다
        System.out.println(stringType instanceof UseRawType);

    }
}

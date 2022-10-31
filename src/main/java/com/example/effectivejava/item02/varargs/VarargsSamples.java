package com.example.effectivejava.item02.varargs;

import java.util.Arrays;

public class VarargsSamples {

    public void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName());  // 타입 출력
        System.out.println(numbers.getClass().getComponentType());  // 어떤 타입의 배열인지 출력
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples =new VarargsSamples();
        samples.printNumbers(5,10);
    }
}

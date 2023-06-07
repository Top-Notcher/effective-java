package com.example.effectivejava.chapter01.item03.functionalinterface;

import com.example.effectivejava.chapter01.item03.methodreference.Person;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {
    public static void main(String[] args) {
        // 첫번째인자 : 인풋, 두번째인자 : 아웃풋
        Function<Integer, String> intToString = Object::toString;

        // 인풋이 없고 아웃풋만 있다.
        Supplier<Person> personSupplier = Person::new;
//        Function<LocalDate, Person> personFunction = Person::new;

        // args는 있지만 return이 없다.
        Consumer<Integer> integerConsumer = System.out::println;

        // 인자를 하나 받아서 boolean을 리턴한다.
        Predicate<Integer> predicate;
    }
}

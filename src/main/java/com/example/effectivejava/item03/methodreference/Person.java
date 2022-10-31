package com.example.effectivejava.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {
    LocalDate birthday;
    public Person(LocalDate birthday){
        this.birthday = birthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public int compareByAge(Person b){
        return this.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));

        // 익명함수
//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//                return a.birthday.compareTo(b.birthday);
//            }
//        });

        // 람다표현
//        people.sort((p1, p2) -> p1.birthday.compareTo(p2.birthday));
        // 메서드 호출이 1개라면 - 메서드 레퍼런스 - 람다표현을 호출하는 역할
        // 스태틱 메서드 레퍼런스
//        people.sort(Person::compareByAge);

        // 인스턴스 메소드 레퍼런스
//        Person person = new Person(null);
//        people.sort(person::compareByAge);

        // 임의 객체의 인스턴스 메소드 레퍼런스
//        people.sort(Person::compareByAge);

        // 생성자 레퍼런스
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982,7,15));
        dates.add(LocalDate.of(1982,7,15));
        dates.add(LocalDate.of(1982,7,15));
//        Function<LocalDate, Person> aNew = Person::new;
//        List<Person> collect = dates.stream().map(aNew).collect(Collectors.toList());
        List<Person> collect = dates.stream().map(Person::new).collect(Collectors.toList());
    }
}

package com.example.effectivejava.chapter04.item15.class_and_interfaces.member;

import java.util.Arrays;

class DefaultMemberService implements MemberService{

    private String name;

    private static class PrivateStaticClass {   // 아무런 레퍼런스가 없다.    // 별개의 클래스

    }

    private class PrivateClass {    // 외부 인스턴스(DefaultMemberService)를 참조
        void doPrint() {
            System.out.println(name);   // 필드 참조가능
        }
    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }

}

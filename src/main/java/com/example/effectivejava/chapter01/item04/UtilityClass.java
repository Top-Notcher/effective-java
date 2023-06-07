package com.example.effectivejava.chapter01.item04;

public abstract class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
    private UtilityClass() {
        // 내부에서 호출 가능하므로
        throw new AssertionError(); // 에러 처리 ( 생성자가 사용된다면 )
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        String hello = UtilityClass.hello();

        // 인스턴스 불필요
//        UtilityClass utilityClass = new UtilityClass();
//        utilityClass.hello();
    }
}

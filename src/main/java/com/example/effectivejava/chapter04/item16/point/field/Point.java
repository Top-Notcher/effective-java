package com.example.effectivejava.chapter04.item16.point.field;

public class Point {
    public double x;
    public double y;

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 10;
        point.y = 20;

        System.out.println(point.x);
        System.out.println(point.y);    // 이렇게 하면 캡슐화의 장점을 제공하지 못하므로 사용 x
    }
}

package com.example.effectivejava.chapter02.item10;

import java.util.ArrayList;
import java.util.List;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) { // 반사성 : 객체의 동일성을 비교
            return true;
        }

        if(!(o instanceof Point)) {
            return false;
        }

        Point p = (Point) o;
        
        return p.x == x && p.y == y;    // 핵심적인 필드만 비교
    }

    // @Override 을 안할 경우
//    public boolean equals(Point p) {
//        if(this == p) { // 반사성 : 객체의 동일성을 비교
//            return true;
//        }
//
//        return p.x == x && p.y == y;    // 핵심적인 필드만 비교
//    }
//
//    public static void main(String[] args) {
//        Point point = new Point(1, 2);
//        List<Point> points = new ArrayList<>();
//        points.add(point);
//        System.out.println(points.contains(new Point(1, 2)));   // false
//    }

    // 잘못된 코드 - 리스코프 치환 원칙 위배! (59쪽)
//    @Override
//    public boolean equals(Object o) {
//        if(o == null || o.getClass() != getClass()) {
//            return false;
//        }
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }


}

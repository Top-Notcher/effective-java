package com.example.effectivejava.chapter04.item17;

import com.example.effectivejava.chapter04.item16.point.method.Point;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class BigIntExample {
    public static void main(String[] args) {
        BigInteger ten = BigInteger.TEN;    // 불변 객체
        BigInteger minusTen = ten.negate();

        // 불변이라면
        Set<Integer> numbers = Set.of(1,2,3);

        // 불변이 아니라면
        final Set<Point> points = new HashSet<>();
        Point firstPoint = new Point(1, 2);
        points.add(firstPoint);
//        firstPoint.x = 10;
    }
}

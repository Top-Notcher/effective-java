package com.example.effectivejava.chapter04.item23.hierarchy;

// 코드 23-2 태그 달린 클래스를 클래스 계층 구조로 변환(144쪽)
public class Circle extends Figure{
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}

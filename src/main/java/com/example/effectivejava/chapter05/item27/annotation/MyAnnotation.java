package com.example.effectivejava.chapter05.item27.annotation;

import java.lang.annotation.*;

@Documented     // java doc 정보에 들어감.
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotation {
}

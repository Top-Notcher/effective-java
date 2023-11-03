package com.example.effectivejava.chapter05.item31.typeinference;

public class Box<T> {
    protected T value;

    public Box() {
    }

    public void change(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}

package com.example.effectivejava.chapter02.item13.exception;

public class MyApp {
    public void hello(String name) throws MyException {
        if(name.equals("park")) {
            throw new MyException();
        }
        System.out.println("hello");
    }

    public static void main(String[] args) throws MyException {
        MyApp myApp = new MyApp();
        try {
            myApp.hello("park");
        } catch (MyException e) {
            myApp.hello("hm");
        }
    }
}

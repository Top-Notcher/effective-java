package com.example.effectivejava.chapter04.item20.templatemethod;

public class Client {

    public static void main(String[] args) {
//        FileProcessor fileProcessor = new Plus("number.txt");
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        System.out.println(fileProcessor.process(Integer::sum));
    }
}

package com.example.effectivejava.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    // 코드 9-1 try-finally - 더 이상 자원을 회수하는 최선의 방책이 아니다! (47쪽)
    static String firstLineOfFile(String path) throws IOException {
        BadBufferedReader br = new BadBufferedReader(new FileReader(path));
        try {
            return br.readLine();   // CharConversionException
        } finally {
            br.close();             // StreamCorruptedException
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));     // 가장 나중에 발생한 예외인 StreamCorruptedException 가 보인다.
    }
}

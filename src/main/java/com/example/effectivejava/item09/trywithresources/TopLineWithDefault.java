package com.example.effectivejava.item09.trywithresources;

import com.example.effectivejava.item09.suppress.BadBufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TopLineWithDefault {
    // 코드 9-5 try-with-resources를 catch 절과 함께 쓰는 모습 (49쪽)
    static String firstLineOfFile(String path, String defaultVal) {
        try(BufferedReader br = new BadBufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    public static void main(String[] args) {
        String path = args[0];
        System.out.println(firstLineOfFile(path, "Toppy McTopFace"));
    }
}

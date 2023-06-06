package com.example.effectivejava.item08.autoclosable;

import java.io.*;

public class AutoClosableIsGood implements AutoCloseable {

//    private BufferedInputStream inputStream;
//
//    @Override
//    public void close() throws Exception {
//        try {
//            inputStream.close();
//        }catch (IOException e) {
//            throw new RuntimeException("failed to close " + inputStream);
//        }
//    }

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        }catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            // logging
            throw new RuntimeException(e);
        }
    }
}

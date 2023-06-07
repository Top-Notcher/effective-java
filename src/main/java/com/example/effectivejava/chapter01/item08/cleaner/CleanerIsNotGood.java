package com.example.effectivejava.chapter01.item08.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> resourceToCleanUp = new ArrayList<>();
        BigObject bigObject = new BigObject(resourceToCleanUp);
        cleaner.register(bigObject, new BigObject.ResourceCleaner(resourceToCleanUp));  // 첫번째 인자가 GC가 될때 두번째 인자로 자원을 해제해라.

        bigObject = null;
        System.gc();
        Thread.sleep(3000L);
    }
}

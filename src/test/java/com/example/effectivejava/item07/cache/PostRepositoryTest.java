package com.example.effectivejava.item07.cache;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {

    @Test
    void cache() throws InterruptedException {
        PostRepository postRepository = new PostRepository();
//        CacheKey key = new CacheKey(1);
        Integer key = 1;    // 참조해제 X
        postRepository.getPostById(key);

        assertFalse(postRepository.getCache().isEmpty());

        key = null;
        // TODO run gc
        System.out.println("run gc");
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);

        assertTrue(postRepository.getCache().isEmpty());
    }

//    @Test
//    void backgroundThread() throws InterruptedException {
//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//        PostRepository postRepository = new PostRepository();
////        CacheKey key1 = new CacheKey(1);
//        Integer key1 = 1;
//        postRepository.getPostById(key1);
//
//        Runnable removeOldCache = () -> {
//            System.out.println("running removeOldCache task");
//            Map<Integer, Post> cache = postRepository.getCache();
//            Set<Integer> cacheKeys = cache.keySet();
//            Optional<CacheKey> key = cacheKeys.stream().min(Comparator.comparing(CacheKey::getCreated));
//            key.ifPresent((k) -> {
//                System.out.println("removing " + k);
//                cache.remove(k);
//            });
//        };
//
//        System.out.println("The time is : " + new Date());
//
//        executor.scheduleAtFixedRate(removeOldCache, 1, 3, TimeUnit.SECONDS);
//
//        Thread.sleep(20000L);
//
//        executor.shutdown();
//    }

}
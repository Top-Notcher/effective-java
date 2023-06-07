package com.example.effectivejava.chapter01.item07.cache;

import java.util.HashMap;
import java.util.Map;

public class PostRepository {

    private Map<Integer, Post> cache;

    public PostRepository() {
        this.cache = new HashMap<>();
//        this.cache = new WeakHashMap<>();
    }

    public Post getPostById(Integer key) {

        if ( cache.containsKey(key)) {
            return cache.get(key);
        }else {
            //TODO DB에서 읽어오거나 REST API를 통해서 읽어올 수 있다.
            Post post = new Post();
            cache.put(key, post);
            return post;
        }
    }

    public Map<Integer, Post> getCache() {
        return cache;
    }
}

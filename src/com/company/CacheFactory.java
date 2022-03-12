package com.company;

public class CacheFactory {
    public static LRU getLRUCache(int maxSize) {
        return new LRU<String, String>(maxSize);
    }
}

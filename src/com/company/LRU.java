package com.company;

import java.util.HashMap;
import java.util.Map;

public class LRU<T, E> implements Cache<T, E> {
    private Map<T, Node> map;
    private Integer maxSize = 100;
    private DoublyLinkedList<T, E> dllist;
    Node head = null;

    public LRU(Integer maxSize) {
        if (maxSize != null) {
            this.maxSize = maxSize;
        }
        map = new HashMap<>();
        dllist = new DoublyLinkedList();
    }

    public void set(T key, E value) {
        if (map.size() >= maxSize) {
            Node node = dllist.add(value);
            map.put(key, node);
        } else {
            this.remove();
        }
    }

    public E get(T key) {
        Node nodeReference = map.get(key);

        dllist.moveToFront(map, key);
        return (E)nodeReference.value;
    }

    private void remove() {
        dllist.removeLast(map);
    }

}

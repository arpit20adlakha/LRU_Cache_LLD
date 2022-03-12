package com.company;

public interface Cache<T, E> {
    public void set(T key, E value);

    public E get(T key);
}

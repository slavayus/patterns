package com.study.patterns.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}

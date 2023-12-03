package com.oreilly.headfirstdesignpatterns.adapter;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.Enumeration;

@AllArgsConstructor
public class IteratorEnumerationAdapter<E> implements Enumeration<E> {

    private Iterator<E> iterator;

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }
}

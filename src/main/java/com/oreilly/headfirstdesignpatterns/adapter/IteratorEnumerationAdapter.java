package com.oreilly.headfirstdesignpatterns.adapter;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.Enumeration;

@AllArgsConstructor
public class IteratorEnumerationAdapter<O> implements Enumeration<O> {

    private Iterator<O> iterator;

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public O nextElement() {
        return iterator.next();
    }
}

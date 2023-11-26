package com.oreilly.headfirstdesignpatterns.strategy.duck;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Mallard extends Duck {

    public Mallard(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.printf("I look like a %s duck.\n", name);
    }
}

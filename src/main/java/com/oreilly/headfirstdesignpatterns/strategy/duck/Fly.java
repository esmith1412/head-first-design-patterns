package com.oreilly.headfirstdesignpatterns.strategy.duck;

public class Fly implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}

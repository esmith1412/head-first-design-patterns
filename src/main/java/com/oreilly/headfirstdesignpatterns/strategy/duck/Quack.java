package com.oreilly.headfirstdesignpatterns.strategy.duck;

public class Quack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

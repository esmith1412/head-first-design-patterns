package com.oreilly.headfirstdesignpatterns.strategy.duck;

public class Swim implements SwimmingBehavior {

    @Override
    public void swim() {
        System.out.println("I'm swimming.");
    }
}

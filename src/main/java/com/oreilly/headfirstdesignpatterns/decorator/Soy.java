package com.oreilly.headfirstdesignpatterns.decorator;

public class Soy extends AddOn {

    public Soy(Beverage beverage) {
        super(0.15, "Soy", beverage);
    }
}

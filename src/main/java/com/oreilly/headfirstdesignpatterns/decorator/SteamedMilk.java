package com.oreilly.headfirstdesignpatterns.decorator;

public class SteamedMilk extends AddOn {

    public SteamedMilk(Beverage beverage) {
        super(0.10, "Steamed Milk", beverage);
    }
}
package com.oreilly.headfirstdesignpatterns.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super(0.89, "House Blend");
    }

    public HouseBlend(Size size) {
        super(0.89, "House Blend", size);
    }
}

package com.oreilly.headfirstdesignpatterns.decorator;

import lombok.*;

@Getter
@Setter
public abstract class AddOn extends Beverage {

    protected Beverage beverage;

    protected AddOn(Beverage beverage) {
        this.beverage = beverage;
    }
}

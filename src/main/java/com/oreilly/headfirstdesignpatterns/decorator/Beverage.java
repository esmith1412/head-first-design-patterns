package com.oreilly.headfirstdesignpatterns.decorator;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Beverage {

    protected double cost;
    protected String description;
    protected Size size = Size.TALL;

    protected Beverage(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }
}

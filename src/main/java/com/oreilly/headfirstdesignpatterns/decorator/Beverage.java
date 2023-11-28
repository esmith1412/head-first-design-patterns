package com.oreilly.headfirstdesignpatterns.decorator;

import lombok.*;

@Getter
@Setter
public abstract class Beverage {

    protected double cost;
    protected String description;
}

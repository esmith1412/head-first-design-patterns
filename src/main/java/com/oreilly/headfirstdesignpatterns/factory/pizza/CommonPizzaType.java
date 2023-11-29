package com.oreilly.headfirstdesignpatterns.factory.pizza;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CommonPizzaType implements PizzaType {

    CHEESE("Cheese"),
    SUPREME("Supreme"),
    PEPPERONI("Pepperoni"),
    VEGETABLE("Vegetable");

    private final String name;
}

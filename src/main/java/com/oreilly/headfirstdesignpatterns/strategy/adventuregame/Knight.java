package com.oreilly.headfirstdesignpatterns.strategy.adventuregame;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Knight extends Character {

    public Knight(String name) {
        super(name);
    }
}

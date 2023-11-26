package com.oreilly.headfirstdesignpatterns.strategy.adventuregame;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Optional;

@Data
@SuperBuilder
@AllArgsConstructor
public abstract class Character {

    protected final String name;

    protected Weapon weapon;

    protected Character(String name) {
        this.name = name;
    }

    public Optional<Weapon> getWeapon() {
        return Optional.ofNullable(weapon);
    }

    public final void useWeapon() {
        getWeapon().orElseThrow( () -> new RuntimeException("A character cannot attack without a weapon!") ).attack();
    }
}

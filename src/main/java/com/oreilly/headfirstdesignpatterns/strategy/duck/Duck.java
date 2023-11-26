package com.oreilly.headfirstdesignpatterns.strategy.duck;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Optional;

@Data
@SuperBuilder
@AllArgsConstructor
public abstract class Duck {

    protected final String name;

    protected FlyingBehavior flyingBehavior;
    protected QuackingBehavior quackingBehavior;
    protected SwimmingBehavior swimmingBehavior;

    protected Duck(String name) {
        this.name = name;
    }

    public abstract void display();

    public Optional<FlyingBehavior> getFlyingBehavior() {
        return Optional.ofNullable(flyingBehavior);
    }

    public Optional<QuackingBehavior> getQuackingBehavior() {
        return Optional.ofNullable(quackingBehavior);
    }

    public Optional<SwimmingBehavior> getSwimmingBehavior() {
        return Optional.ofNullable(swimmingBehavior);
    }

    public final void performFlyingBehavior() {
        getFlyingBehavior().orElseThrow( () -> new RuntimeException(name + " has no flying behavior!") ).fly();
    }

    public final void performQuackingBehavior() {
        getQuackingBehavior().orElseThrow( () -> new RuntimeException(name + " has no quacking behavior!") ).quack();
    }

    public final void performSwimmingBehavior() {
        getSwimmingBehavior().orElseThrow( () -> new RuntimeException(name + " has no swimming behavior!") ).swim();
    }
}

package com.oreilly.headfirstdesignpatterns.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class TurnOnLightCommand implements Command {

    protected final Light light;

    @Override
    public void execute() {
        light.turnOn();
    }
}
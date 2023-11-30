package com.oreilly.headfirstdesignpatterns.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class TurnOnLightCommand implements UndoableCommand {

    protected final Light light;

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
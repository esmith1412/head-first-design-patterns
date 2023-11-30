package com.oreilly.headfirstdesignpatterns.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class TurnLightOffCommand implements UndoableCommand {

    protected final Light light;

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
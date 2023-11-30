package com.oreilly.headfirstdesignpatterns.command;

public interface DimmableLight extends Light {

    void increaseBrightness();
    void decreaseBrightness();
}

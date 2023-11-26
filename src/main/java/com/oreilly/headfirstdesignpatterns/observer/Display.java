package com.oreilly.headfirstdesignpatterns.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Display {

    protected final WeatherData weatherData;

    public abstract void show();
    public abstract void update();

    public void add() {
        weatherData.add(this);
    }

    public void remove() {
        weatherData.remove(this);
    }
}

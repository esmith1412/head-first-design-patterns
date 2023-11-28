package com.oreilly.headfirstdesignpatterns.observer;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Display {

    protected WeatherData weatherData;

    public abstract void show();
    public abstract void update();
}

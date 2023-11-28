package com.oreilly.headfirstdesignpatterns.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Display {

    protected WeatherData weatherData;

    public abstract void show();
    public abstract void update();
}

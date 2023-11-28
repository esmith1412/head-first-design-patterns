package com.oreilly.headfirstdesignpatterns.observer;

import lombok.*;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {

    private double humidity;
    private double temperature;
    private double barometricPressure;
    private Collection<Display> displays;

    public void add(Display display) {
        displays.add(display);
    }

    public void remove(Display display) {
        displays.remove(display);
    }

    public void measurementsChanged() {
        displays.forEach(Display::update);
    }
}

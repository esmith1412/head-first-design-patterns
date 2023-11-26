package com.oreilly.headfirstdesignpatterns.observer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {

    private double humidity;
    private double temperature;
    private double barometricPressure;
    private List<Display> displays = new ArrayList<>();

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

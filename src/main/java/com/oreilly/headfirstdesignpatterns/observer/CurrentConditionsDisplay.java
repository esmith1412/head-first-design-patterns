package com.oreilly.headfirstdesignpatterns.observer;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrentConditionsDisplay extends Display {

    private double humidity;
    private double temperature;
    private double barometricPressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void show() {
        System.out.printf(
            "The temperature is %s; the humidity is %s, and the barometric pressure is %s.\n",
            temperature, humidity, barometricPressure
        );
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.temperature = weatherData.getTemperature();
        this.barometricPressure = weatherData.getBarometricPressure();
        show();
    }
}

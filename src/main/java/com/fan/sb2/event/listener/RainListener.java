package com.fan.sb2.event.listener;

import com.fan.sb2.event.RainEvent;
import com.fan.sb2.event.WeatherEvent;

public class RainListener implements WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello"+event.getWeather());
        }
    }
}

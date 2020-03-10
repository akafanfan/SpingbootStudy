package com.fan.sb2.event.listener;

import com.fan.sb2.event.SnowEvent;
import com.fan.sb2.event.WeatherEvent;

public class SnowListener implements WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        //instanceof测试左边是否是右边的实体类
        if (event instanceof SnowEvent) {
            System.out.println("hello"+event.getWeather());
        }
    }
}

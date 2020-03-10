package com.fan.sb2.event;

import com.fan.sb2.event.listener.WeatherListener;

/**
 * 事件广播器
 */
public interface EventMulticaster {
    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener weatherListener);

    void removeaListener(WeatherListener weatherListener);
}

package com.fan.sb2.event;

import com.fan.sb2.event.listener.RainListener;
import com.fan.sb2.event.listener.SnowListener;

public class Test {
    public static void main(String[] args) {
        //构造一个广播器
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        //定义两个监听器
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());
        eventMulticaster.removeaListener(rainListener);
        eventMulticaster.multicastEvent(new SnowEvent());
        eventMulticaster.multicastEvent(new RainEvent());

    }
}

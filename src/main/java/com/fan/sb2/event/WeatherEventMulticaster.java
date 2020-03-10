package com.fan.sb2.event;

public class WeatherEventMulticaster extends AbstractEventMulticaster{
    @Override
    void doStart() {
        System.out.println("开始广播 weather evernt");
    }

    @Override
    void doEnd() {
        System.out.println("结束广告 weather event");
    }
}

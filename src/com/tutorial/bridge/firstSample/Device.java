package com.tutorial.bridge.firstSample;

public interface Device {
    boolean isEnabled();

    void turnOff();

    void turnOn();

    void setChannel(int channel);

    int getChannel();

    void setVolume(int volume);

    int getVolume();

    void printStatus();

}

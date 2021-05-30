package com.tutorial.bridge;

import com.tutorial.bridge.Device;

public class Tv implements Device {
    private boolean enabled = false;
    private int channel = 1;
    private int volume = 15;

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void turnOff() {
        System.out.println("Tv turns off");
        this.enabled = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Tv turns on");
        this.enabled = true;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Tv channel set to: " + channel);
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Tv volume set to: " + volume);
        if (volume < 0) {
            volume = 0;
        } else if (volume > 100) {
            volume = 100;
        }
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void printStatus() {
        System.out.println("Tv status is " +
                (enabled == true ? "on" : "off")
                + "\n Tv channel:" + this.channel
                + "\n Tv volume:" + this.volume
        );
    }
}

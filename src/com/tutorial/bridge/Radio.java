package com.tutorial.bridge;

public class Radio implements Device {
    private boolean enabled = false;
    private int channel = 1001;
    private int volume = 50;

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turns off");
        this.enabled = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Radio turns on");
        this.enabled = true;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Radio channel set to: " + channel);
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to: " + volume);
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
        System.out.println("Radio status is " +
                (enabled == true ? "on" : "off")
                + "\n Radio channel:" + this.channel
                + "\n Radio volume:" + this.volume
        );
    }
}

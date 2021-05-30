package com.tutorial.bridge;

public class BasicRemote implements Remote {

    public Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote power()");
        if (this.device.isEnabled()) {
            this.device.turnOff();
        } else {
            this.device.turnOn();
        }
    }

    @Override
    public void channelUp() {
        System.out.println("Remote channelUp()");
        this.device.setChannel(this.device.getChannel() + 1);

    }

    @Override
    public void channelDown() {
        System.out.println("Remote channelDown()");
        this.device.setChannel(this.device.getChannel() - 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote volumeUp()");
        this.device.setVolume(this.device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote volumeDown()");
        this.device.setVolume(this.device.getVolume() - 5);

    }
}

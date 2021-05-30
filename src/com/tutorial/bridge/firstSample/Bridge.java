package com.tutorial.bridge.firstSample;

/*
 * structural pattern
 * bridge seperate logic
 * connect class by difference logic
 *
 * */
public class Bridge {
    public static void main(String[] args) {
        Device radio = new Radio();
        radio.turnOn();
        radio.setVolume(5);
        radio.setChannel(2000);
        BasicRemote basicRemote = new BasicRemote(radio);
        basicRemote.power();
        basicRemote.channelUp();
        basicRemote.volumeDown();
        radio.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.mute();
    }
}

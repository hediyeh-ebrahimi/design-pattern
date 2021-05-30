package com.tutorial.bridge;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    void mute(){
        System.out.println("AdvancedRemote mute()");
        super.device.setVolume(0);
    }
}

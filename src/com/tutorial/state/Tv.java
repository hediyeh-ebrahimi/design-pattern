package com.tutorial.state;

//Context
public class Tv {
    private RemoteControl remoteControl;

    public Tv(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void togglePower(){
        this.remoteControl.switchState(this);
    }
}

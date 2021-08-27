package com.tutorial.mediator.firstSample;

public class Fan extends FanMachine {
    private boolean isOn = false;

    public Fan(Mediator mediator) {
        super(mediator);
    }

    public boolean isOn() {
        return isOn;
    }

    public void on(){
        this.mediator.start();
        System.out.println("Fan is on");
        this.isOn= true;

    }
    public void off(){
        this.mediator.stop();
        System.out.println("Fan is off");
        this.isOn= false;
    }
}

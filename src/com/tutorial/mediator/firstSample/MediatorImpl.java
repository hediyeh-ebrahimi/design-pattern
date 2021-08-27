package com.tutorial.mediator.firstSample;

public class MediatorImpl implements Mediator {
    private Fan fan;
    private PowerSupply powerSupply;

    void setFan(Fan fan) {
        this.fan = fan;
    }

    void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void pressButton() {
        if(this.fan.isOn()){
            this.fan.off();
        }else{
            this.fan.on();
        }

    }

    @Override
    public void start() {
        this.powerSupply.on();
    }

    @Override
    public void stop() {
        this.powerSupply.off();
    }
}

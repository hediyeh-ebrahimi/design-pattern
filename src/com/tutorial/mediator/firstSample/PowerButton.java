package com.tutorial.mediator.firstSample;

public class PowerButton extends FanMachine {
    public PowerButton(Mediator mediator) {
        super(mediator);
    }

    public void press() {
        this.mediator.pressButton();
    }
}

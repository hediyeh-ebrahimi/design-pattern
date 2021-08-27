package com.tutorial.mediator.firstSample;

public abstract class FanMachine {
    protected Mediator mediator;

    public FanMachine(Mediator mediator) {
        this.mediator = mediator;
    }
}
//colleague
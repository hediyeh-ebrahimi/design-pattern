package com.tutorial.mediator.firstSample;

/*
*  behavioural design pattern
*  it causes loosely coupled, reusable
* it manges communication between objects
* all objects not connected to gethor they have a reference to mediator
* */
public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        powerButton.press();
//        powerButton.press();

        Mediator mediator = new MediatorImpl();
        ((MediatorImpl) mediator).setFan(new Fan(mediator));
        PowerButton powerButton = new PowerButton(mediator);
        ((MediatorImpl) mediator).setPowerSupply(new PowerSupply());
        powerButton.press();
        System.out.println("------------");
        powerButton.press();
        System.out.println("------------");
    }
}

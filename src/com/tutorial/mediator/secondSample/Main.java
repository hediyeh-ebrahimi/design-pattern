package com.tutorial.mediator.secondSample;

/*
* behavioral design pattern
* mediator = vaseteh(loosely couple , reusable)
*mediator => reduce dependency object together
* all objects on mediator dependent together
*  mediators( keeps colleaguage objects ) , colleagues objects
*
* */
public class Main {
    public static void main(String[] args) {
        MessageMediator messageMediator = new MessageMediator();
        Client hediyeh = new Client(messageMediator,"hediyeh");
        Client sara = new Client(messageMediator,"sara");
        hediyeh.sendMessage(sara.getName(),"hello my friend");

        Group group = new Group(messageMediator,"group");
        group.getClientList().add(hediyeh);
        group.getClientList().add(sara);
        group.sendMessage(null,"Hello our members");
    }
}

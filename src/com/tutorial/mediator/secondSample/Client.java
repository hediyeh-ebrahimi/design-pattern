package com.tutorial.mediator.secondSample;

public class Client extends SenderReceiver {

    public Client(com.tutorial.mediator.secondSample.MessageMediator messageMediator, String name) {
        super(messageMediator, name);
    }

    @Override
    public void sendMessage(String username, String message) {
        messageMediator.broadcast(this,username,message);
    }
}
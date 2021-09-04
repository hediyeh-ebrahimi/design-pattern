package com.tutorial.mediator.secondSample;

import java.util.Date;

//colleague
public abstract class SenderReceiver {
    protected MessageMediator messageMediator;
    private String name;


    public SenderReceiver(MessageMediator messageMediator, String name) {
        this.messageMediator = messageMediator;
        this.name = name;
        this.messageMediator.registerClient(this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(SenderReceiver senderReceiver , String message){
        System.out.println("--------------------");
        System.out.println(senderReceiver.getName());
        System.out.println(String.format("<%s><%s>:%S",senderReceiver.getName(),new Date().toString(),message));

    }

    public abstract void sendMessage(String username,String message);
}

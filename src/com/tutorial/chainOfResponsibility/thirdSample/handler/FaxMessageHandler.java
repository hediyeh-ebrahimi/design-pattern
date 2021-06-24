package com.tutorial.chainOfResponsibility.thirdSample.handler;

import com.tutorial.chainOfResponsibility.thirdSample.Message;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageHandler next) {
        super(next);
    }

    @Override
    public void handle(Message message) {
        if(message.getMap().containsKey(Message.Destination.FAX)){
            System.out.println(String.format("Message sent to : %s via Fax",message.getValue()));
            System.out.println();
        }
        if(next != null){
            next.handle(message);
        }
    }
}

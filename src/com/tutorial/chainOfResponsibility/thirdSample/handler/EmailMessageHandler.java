package com.tutorial.chainOfResponsibility.thirdSample.handler;

import com.tutorial.chainOfResponsibility.thirdSample.Message;

public class EmailMessageHandler extends MessageHandler {
    public EmailMessageHandler(MessageHandler next) {
        super(next);
    }

    @Override
    public void handle(Message message) {
        if(message.getMap().containsKey(Message.Destination.EMAIL)){
            System.out.println(String.format("Message sent to : %s via Email",message.getValue()));
            System.out.println();
        }
        if(next != null){
            next.handle(message);
        }
    }
}

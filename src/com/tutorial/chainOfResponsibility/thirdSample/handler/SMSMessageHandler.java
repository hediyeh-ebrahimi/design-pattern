package com.tutorial.chainOfResponsibility.thirdSample.handler;

import com.tutorial.chainOfResponsibility.thirdSample.Message;

public class SMSMessageHandler extends MessageHandler {
    public SMSMessageHandler(MessageHandler next) {
        super(next);
    }

    @Override
    public void handle(Message message) {
        if(message.getMap().containsKey(Message.Destination.SMS)){
            System.out.println(String.format("Message sent to : %s via SMS",message.getValue()));
            System.out.println();
        }
        if(next != null){
            next.handle(message);
        }
    }
}

package com.tutorial.chainOfResponsibility.thirdSample.service;

import com.tutorial.chainOfResponsibility.thirdSample.Message;
import com.tutorial.chainOfResponsibility.thirdSample.handler.EmailMessageHandler;
import com.tutorial.chainOfResponsibility.thirdSample.handler.FaxMessageHandler;
import com.tutorial.chainOfResponsibility.thirdSample.handler.MessageHandler;
import com.tutorial.chainOfResponsibility.thirdSample.handler.SMSMessageHandler;

public class MessageService {

    public void sendMessage(Message message){
        MessageHandler messageHandler = null;
        for (Message.Destination destination :message.getMap().keySet()){
            switch (destination){
                case EMAIL:
                    messageHandler = new EmailMessageHandler(messageHandler);
                    break;
                case FAX:
                    messageHandler = new FaxMessageHandler(messageHandler);
                    break;
                case SMS:
                    messageHandler = new SMSMessageHandler(messageHandler);
                    break;
            }
        }

        if(messageHandler != null){
            messageHandler.handle(message);
        }
    }
}

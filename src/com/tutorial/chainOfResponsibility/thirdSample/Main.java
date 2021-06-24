package com.tutorial.chainOfResponsibility.thirdSample;

import com.tutorial.chainOfResponsibility.thirdSample.service.MessageService;

public class Main {
    public static void main(String[] args) {
        Message message = Message.getBuilder().setValue("Hi , new Message contact us")
                .addDestination(Message.Destination.EMAIL,"hediye@gmail.com")
                .addDestination(Message.Destination.SMS,"0935165")
                .addDestination(Message.Destination.FAX,"021479")
                .createMessage();
        System.out.println(message.getValue());
        System.out.println(message.getMap());

        MessageService messageService = new MessageService();
        messageService.sendMessage(message);
    }
}

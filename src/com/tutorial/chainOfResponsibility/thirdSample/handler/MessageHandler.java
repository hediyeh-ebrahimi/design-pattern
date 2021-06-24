package com.tutorial.chainOfResponsibility.thirdSample.handler;

import com.tutorial.chainOfResponsibility.thirdSample.Message;

public abstract class MessageHandler {
    protected final MessageHandler next;

    public MessageHandler(MessageHandler next) {
        this.next = next;
    }

    public abstract void handle(Message message);
}

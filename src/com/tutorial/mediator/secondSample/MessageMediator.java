package com.tutorial.mediator.secondSample;

import java.util.HashMap;
import java.util.Map;

//mediator
public class MessageMediator {
    private Map<String,SenderReceiver> receiverMap = new HashMap<>();

    public void registerClient(SenderReceiver senderReceiver) {
        this.receiverMap.put(senderReceiver.getName(),senderReceiver);
    }

    public void broadcast(SenderReceiver sender,String clientName,String message){
        if(this.receiverMap.containsKey(clientName)){
            SenderReceiver senderReceiver= this.receiverMap.get(clientName);
            senderReceiver.receiveMessage(senderReceiver,message);
        }
    }
}

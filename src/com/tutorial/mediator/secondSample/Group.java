package com.tutorial.mediator.secondSample;

import java.util.ArrayList;
import java.util.List;

public class Group extends SenderReceiver {
    public Group(MessageMediator messageMediator, String name) {
        super(messageMediator, name);
    }
    List<Client> clientList = new ArrayList<>();

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public void sendMessage(String username, String message) {
        this.clientList.forEach(client -> messageMediator.broadcast(this,client.getName(),message));
    }
}

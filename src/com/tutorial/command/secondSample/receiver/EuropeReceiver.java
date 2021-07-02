package com.tutorial.command.secondSample.receiver;

public class EuropeReceiver implements Receiver {
    @Override
    public void connect() {
        System.out.println("Europe Server Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Europe Server DisConnect");

    }

    @Override
    public void shutdown() {
        System.out.println("Europe Server ShutDown");
    }

    @Override
    public void reboot() {
        System.out.println("Europe Server Reboot");
    }
}

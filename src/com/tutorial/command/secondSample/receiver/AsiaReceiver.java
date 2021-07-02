package com.tutorial.command.secondSample.receiver;

public class AsiaReceiver implements Receiver {
    @Override
    public void connect() {
        System.out.println("Asia Server Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Asia Server DisConnect");

    }

    @Override
    public void shutdown() {
        System.out.println("Asia Server ShutDown");
    }

    @Override
    public void reboot() {
        System.out.println("Asia Server Reboot");
    }
}

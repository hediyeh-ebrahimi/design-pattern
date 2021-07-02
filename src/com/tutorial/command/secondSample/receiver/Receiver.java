package com.tutorial.command.secondSample.receiver;

public interface Receiver {
    void connect();
    void disconnect();
    void shutdown();
    void reboot();
}

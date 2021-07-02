package com.tutorial.command.secondSample.command;

import com.tutorial.command.secondSample.receiver.Receiver;

public abstract class Command {
    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}

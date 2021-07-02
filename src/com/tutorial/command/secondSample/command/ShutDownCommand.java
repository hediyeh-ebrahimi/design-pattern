package com.tutorial.command.secondSample.command;

import com.tutorial.command.secondSample.receiver.Receiver;

public class ShutDownCommand extends Command {
    public ShutDownCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
    }
}

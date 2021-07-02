package com.tutorial.command.secondSample.command;

import com.tutorial.command.secondSample.receiver.Receiver;

public class RebootCommand extends Command {
    public RebootCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.reboot();
        receiver.shutdown();
    }
}

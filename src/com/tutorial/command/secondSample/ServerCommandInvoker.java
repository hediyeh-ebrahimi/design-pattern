package com.tutorial.command.secondSample;

import com.tutorial.command.secondSample.command.Command;

public class ServerCommandInvoker {
    private final Command command;

    public ServerCommandInvoker(Command command) {
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}

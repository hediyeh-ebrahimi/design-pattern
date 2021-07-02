package com.tutorial.command.secondSample;

import com.tutorial.command.secondSample.command.ShutDownCommand;
import com.tutorial.command.secondSample.receiver.AsiaReceiver;
import com.tutorial.command.secondSample.receiver.Receiver;

/*
* convert some instructions to object
* object oriented callback
*
* undo projects we use command design pattern
* runnable interface , swing action
*
* client , command(the task must be done),invoker (a person who delivers command (dastoor)), receiver (a person who must be done task)
* */
public class Main {
    public static void main(String[] args) {
        Receiver asia = new AsiaReceiver();
        ShutDownCommand shutDownCommand = new ShutDownCommand(asia);//command
        ServerCommandInvoker serverCommandInvoker = new ServerCommandInvoker(shutDownCommand);//invoker
        serverCommandInvoker.run();
    }
}

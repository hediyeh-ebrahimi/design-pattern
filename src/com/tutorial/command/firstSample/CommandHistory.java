package com.tutorial.command.firstSample;

import java.util.Stack;

public class CommandHistory {

    Stack<Command> history = new Stack<>();

    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        return history.pop();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}

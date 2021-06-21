package com.tutorial.chainOfResponsibility.firstSample;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        super(level);
    }


    @Override
    public void log(String message, int level) {
        if(level >= this.level){
            System.out.println("Console Logger: "+message);
        }
        next(message,level);

    }
}

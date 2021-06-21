package com.tutorial.chainOfResponsibility.firstSample;

import com.tutorial.chainOfResponsibility.firstSample.Logger;

public class AbstractLogger implements Logger {

    protected Logger nextLogger;
    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    @Override
    public Logger setNext(Logger logger) {
        this.nextLogger = logger;
        return this;
    }

    @Override
    public void log(String message, int level) {
        System.out.println("Log: "+message);
    }


    protected void next(String message, int level){
        if(this.nextLogger != null){
            this.nextLogger.log(message,level);
        }
    }
}

package com.tutorial.chainOfResponsibility.firstSample;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
    }

    @Override
    public void log(String message, int level) {
        if(level >= this.level){
            System.out.println("File Logger: "+message);
        }
        next(message,level);
    }
}

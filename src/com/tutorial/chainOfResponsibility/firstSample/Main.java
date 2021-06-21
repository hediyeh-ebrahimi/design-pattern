package com.tutorial.chainOfResponsibility.firstSample;


import com.tutorial.chainOfResponsibility.firstSample.ConsoleLogger;
import com.tutorial.chainOfResponsibility.firstSample.FileLogger;
import com.tutorial.chainOfResponsibility.firstSample.Logger;

/*
 * behavioral design pattern
 *  it s use for chain of responsibilities
 *
 * methods setNext is important for chaining
 *
 * authentication,authorization
 *
 * */
public class Main {

    public static void main(String[] args) {
        // without logger

        FileLogger fileLogger = new FileLogger(Logger.INFO);
        ConsoleLogger consoleLogger = new ConsoleLogger(Logger.DEBUG);

        fileLogger.log("test file logger",Logger.DEBUG);
        consoleLogger.log("test console logger",Logger.ERROR);

        System.out.println("----------------");

        //by logger,chain of responsibilites
        Logger fileloggerChain = new FileLogger(Logger.INFO).setNext(new ConsoleLogger(Logger.DEBUG));
        fileloggerChain.log("Chain of Responsibility",Logger.DEBUG);
    }
}

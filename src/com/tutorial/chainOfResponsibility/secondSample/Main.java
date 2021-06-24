package com.tutorial.chainOfResponsibility.secondSample;

import com.tutorial.chainOfResponsibility.firstSample.ConsoleLogger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
*  a task you want to handler is done => chain of responsibility
*
* handelers must be implements interface
*
* */
public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger("Log");
        logger.setLevel(Level.FINEST);//all details , finest > finer > fine

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);
        logger.addHandler(consoleHandler);

        FileHandler fileHandler = new FileHandler("log.xml");
        fileHandler.setLevel(Level.ALL);
        logger.addHandler(fileHandler);

        logger.finest("Finest Message");
        logger.fine("Fine Message");
        logger.finer("Finer Message");

    }
}

package com.tutorial.chainOfResponsibility.firstSample;

public interface Logger {
    int INFO = 1;
    int DEBUG = 2;
    int ERROR = 3;

    Logger setNext(Logger logger);

    void log(String message, int level);
}

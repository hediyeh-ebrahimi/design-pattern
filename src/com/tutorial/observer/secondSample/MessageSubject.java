package com.tutorial.observer.secondSample;

import java.util.Observable;

public class MessageSubject extends Observable {

    public void receiveMessage(String message) {
        setChanged();
        notifyObservers(message);
    }
}

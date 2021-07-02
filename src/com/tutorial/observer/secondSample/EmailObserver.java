package com.tutorial.observer.secondSample;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class EmailObserver implements Observer {
    private List<String> emails;

    public EmailObserver(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.emails.forEach(email -> System.out.println("Email: " + email + "- Message: " + arg));
    }
}

package com.tutorial.observer.secondSample;

import java.util.Arrays;
import java.util.List;

/*
 * observer => eventHandling
 *  system publish subscribers
 *  observer -> update
 * observable -> attach,detach,notify
 *
 * */
public class Main {
    public static void main(String[] args) {
        MessageSubject messageSubject = new MessageSubject();
        List<String> emails = Arrays.asList("hediyeh@gmail.com", "sara@yahoo.com");
        EmailObserver emailObserver = new EmailObserver(emails);
        messageSubject.addObserver(emailObserver);

        List<String> faxes = Arrays.asList("1258");
        FaxObserver faxObserver = new FaxObserver(faxes);
        messageSubject.addObserver(faxObserver);

        messageSubject.notifyObservers();
        messageSubject.receiveMessage("First Message");

        System.out.println("------------");

        messageSubject.deleteObserver(faxObserver);
        messageSubject.notifyObservers();

        messageSubject.receiveMessage("First Message");

    }
}

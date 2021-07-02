package com.tutorial.observer.secondSample;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FaxObserver implements Observer {
    private List<String> faxes;

    public FaxObserver(List<String> faxes) {
        this.faxes = faxes;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.faxes.forEach(fax -> System.out.println("Fax: " + fax + " -Message: " + arg));

    }
}

package com.tutorial.observer.firstSample;


/*
 * observable (subject),observer
 * observable notifies all observers
 * subject (attach,detach,notify)
 * observer(update)
 * */
public class Main {
    public static void main(String[] args) {
        NewsNetwork newsNetwork = new NewsNetwork("covid 19");

        Channel tv = new Tv();
        Channel radio = new Radio();

        newsNetwork.attach(tv);
        newsNetwork.attach(radio);
        newsNetwork.notifyAllObservers();
        System.out.println("------");
        newsNetwork.detach(radio);
        newsNetwork.notifyAllObservers();

    }
}

package com.tutorial.observer.firstSample;

import java.util.ArrayList;
import java.util.List;

/*
* newsNetwork is subject (observable)
*
* */
public class NewsNetwork {

    private List<Channel> channels = new ArrayList<>();
    private String news;

    public NewsNetwork(String news) {
        this.news = news;
        this.notifyAllObservers();
    }

    public void attach(Channel channel){
        this.channels.add(channel);
    }

    public void detach(Channel channel){
        this.channels.remove(channel);
    }

    public void notifyAllObservers(){
        this.channels.forEach(channel -> channel.update(news));
    }
}

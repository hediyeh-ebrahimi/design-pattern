package com.tutorial.state;

/*
* state , concrete class
*  statues of objects
*  network connection (close,open,interruption) => we have 3 class for statuses
*  حالتهای متفاوت یک شی نگه داری میکند
* */
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = Off.getInstance();
        Tv tv = new Tv(remoteControl);
        tv.togglePower();
    }
}

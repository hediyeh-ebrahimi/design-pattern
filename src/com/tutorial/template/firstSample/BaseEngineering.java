package com.tutorial.template.firstSample;

public abstract class BaseEngineering {
    public void study() {
        math();
        physics();
        additionalStudy();
    }

    public abstract void additionalStudy();

    private void physics() {
        System.out.println("BaseEngineering Physics ");
    }

    private void math() {
        System.out.println("BaseEngineering Math ");
    }

}

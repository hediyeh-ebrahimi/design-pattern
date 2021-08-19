package com.tutorial.memento.secondSample;

public class TextMemento {
    private String text;

    public TextMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
//memento
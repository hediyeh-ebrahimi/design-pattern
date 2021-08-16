package com.tutorial.memento.firstSample;

public class TextWindow {
    private StringBuilder stringBuilder;

    public TextWindow() {
        this.stringBuilder = new StringBuilder();
    }

    public void print() {
        System.out.println(this.stringBuilder.toString());
    }


    public void addText(String text) {
        this.stringBuilder.append(text);
    }

    public TextWindowStatus saveStatus(){
        return new TextWindowStatus(this.stringBuilder.toString());
    }

    public void restoreStatus(TextWindowStatus textWindowStatus){
        this.stringBuilder = new StringBuilder(textWindowStatus.getText());
    }


}

//orginator
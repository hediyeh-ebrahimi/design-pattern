package com.tutorial.memento.firstSample;


import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private TextWindow textWindow ;
    private List<TextWindowStatus> checkPoints = new ArrayList<>();

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void show(){
        this.textWindow.print();
    }
    public void write(String text){
        this.textWindow.addText(text);
    }

    public void save(){
        TextWindowStatus status = this.textWindow.saveStatus();
        this.checkPoints.add(status);
    }
    public void restore(int i){
        this.textWindow.restoreStatus(checkPoints.get(i));
    }
}
//caretaker
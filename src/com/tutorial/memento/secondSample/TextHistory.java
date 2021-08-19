package com.tutorial.memento.secondSample;

import javax.swing.*;
import java.util.LinkedList;

public class TextHistory {
    private LinkedList<TextMemento> history = new LinkedList<>();
    private JTextField jTextField;

    public TextHistory(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public void save(){
        this.history.add(new TextMemento(jTextField.getText()));
        this.jTextField.setText("");
    }

    public void undo(){
        if(this.history.size() > 0){
            this.jTextField.setText(this.history.pop().getText());
        }else{
            this.jTextField.setText("");
        }
    }
}
//caretaker

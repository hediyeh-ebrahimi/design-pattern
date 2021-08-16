package com.tutorial.memento.firstSample;

/*
* ctrl z => undo, rollback
*  it returns state of an object
* java.util.Date ,java.io.Serializable
* orginator (main object that we save the state of it),caretaker(the object that stores , keep all memento objects),memento (copy object of orginator)
* memento  immutable
*
* */
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("hi");
        textEditor.show();
        textEditor.write(" memento");
        textEditor.write(" design pattern");
        textEditor.show();

        textEditor.save();
        System.out.println("-----------------------");
        textEditor.restore(0);
        textEditor.show();
    }
}

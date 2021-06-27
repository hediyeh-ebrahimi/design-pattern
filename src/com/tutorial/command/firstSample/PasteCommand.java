package com.tutorial.command.firstSample;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipBoard != null && !editor.clipBoard.trim().isEmpty()) {
            backup();
            editor.textField.insert(editor.clipBoard, editor.textField.getCaretPosition());
            return true;
        }else{
            return false;// it is not undoable
        }
    }
}

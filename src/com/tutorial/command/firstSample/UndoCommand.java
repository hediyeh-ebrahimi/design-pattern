package com.tutorial.command.firstSample;

public class UndoCommand extends Command {
    public UndoCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.history != null) {
            Command command = editor.history.pop();
            command.undo();
            return true;
        }else {
            return false;
        }
    }
}

package com.tutorial.command.firstSample;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipBoard = editor.textField.getSelectedText();
        return false;
    }
}

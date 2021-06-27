package com.tutorial.command.firstSample;

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (!editor.textField.getSelectedText().trim().isEmpty()) {
            backup();
            String source = editor.textField.getText();
            editor.clipBoard = editor.textField.getSelectedText();
            editor.textField.setText(cutString(source));
            return true;
        }else{
            return true;
        }
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());

        return start + end;
    }
}

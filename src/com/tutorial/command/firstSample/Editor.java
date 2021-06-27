package com.tutorial.command.firstSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Editor {
    public JTextArea textField;
    public String clipBoard;
//    private Stack<String> history = new Stack<>();
    public CommandHistory history = new CommandHistory();

    public void init() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.setContentPane(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        jPanel.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;

        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                clipBoard = textField.getSelectedText();

                executeCommand(new CopyCommand(editor));
            }
        });

        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (!textField.getSelectedText().trim().isEmpty()) {
//                    history.push(textField.getText());
//                    String source = textField.getText();
//                    clipBoard = textField.getSelectedText();
//                    textField.setText(cutString(source));
//                }

                executeCommand(new CutCommand(editor));
            }

        });

        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (clipBoard != null && !clipBoard.trim().isEmpty()) {
//                    history.push(textField.getText());
//                    textField.insert(clipBoard, textField.getCaretPosition());
//                }

                executeCommand(new PasteCommand(editor));
            }
        });

        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (history != null) {
//                    textField.setText(history.pop());
//                }

                executeCommand(new UndoCommand(editor));
            }
        });

        buttons.add(ctrlC);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        buttons.add(ctrlX);
        jPanel.add(buttons);
        jFrame.setSize(450, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);


    }

    private String cutString(String source) {
        String start = source.substring(0, textField.getSelectionStart());
        String end = source.substring(textField.getSelectionEnd());

        return start + end;
    }

    private void executeCommand(Command command){
        if(command.execute()){
            history.push(command);
        }
    }
}

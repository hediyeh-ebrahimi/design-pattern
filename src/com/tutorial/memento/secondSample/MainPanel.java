package com.tutorial.memento.secondSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JPanel {
    private JButton jButton;
    private JLabel jLabel;
    private JTextField jTextField;
    private TextHistory textHistory;

    public MainPanel() {
        this.jLabel = new JLabel("Texts:");
        this.jTextField = new JTextField(20);
        this.jButton = new JButton("Save");
        textHistory = new TextHistory(this.jTextField);
        setLayout(new FlowLayout());
        add(this.jLabel);
        add(this.jTextField);
        add(this.jButton);
        this.jButton.addActionListener(event-> textHistory.save());
        this.jTextField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_Z && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)){
                    textHistory.undo();
                }
            }
        });

    }
}

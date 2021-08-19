package com.tutorial.memento.secondSample;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Memento Design Pattern");
        jFrame.setSize(500,150);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new MainPanel());
        jFrame.setVisible(true);

    }
}

package com.tutorial.flyweight.firstSample;

import java.awt.*;

/*
 * flyweight object => name,color are common => immutable => setter not use
 * */
public class TreeType {
    public static final int SIZE = 3;

    private String name;
    private Color color;

    public TreeType() {
    }

    public TreeType(String name, Color color) {
        this.name = name;
        this.color = color;
        MemoryReport.calculate(SIZE);
    }

    public void draw(Graphics graphics, int x, int y) {
        //tree
        graphics.setColor(Color.black);
        graphics.fillRect(x - 1, y, 3, 5);
        graphics.setColor(this.color);
        graphics.fillRect(x - 5, y - 10, 10, 10);
    }
}

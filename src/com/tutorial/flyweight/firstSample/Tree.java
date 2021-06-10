package com.tutorial.flyweight.firstSample;

import java.awt.*;

public class Tree {

    public final static int SIZE = 1;
    private int x;
    private int y;
    private TreeType treeType;

    public Tree() {
    }

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
        MemoryReport.calculate(SIZE);
    }

    public void draw(Graphics graphics) {
        treeType.draw(graphics, x, y);
    }
}

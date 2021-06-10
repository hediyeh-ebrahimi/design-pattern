package com.tutorial.flyweight.firstSample;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    List<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color) {
        TreeType treeType = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);

    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : treeList) {
            tree.draw(graphics);
        }
    }
}
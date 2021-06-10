package com.tutorial.flyweight.firstSample;

import java.awt.*;

/*
 *  structural pattern
 * lots of object generate but use low usage of memory
 * immutable must be common part
 *  flyweight object => factory method
 * flyweight object in cache keep
 * flyweight => repetitive state
 * */
public class FlyWeight {
    private static final int CANVAS_SIZE = 500;
    private static final int TREE_TO_DRAW = 1000000;
    private static final int TREE_TYPE = 500;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < TREE_TO_DRAW / 2; i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN);
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE);
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        report();

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * (max - min) + 1);
    }


    private static void report() {
        System.out.println();
        System.out.println("************** Report ******************");
        System.out.println("Memory consumption with flyweight: ");
        MemoryReport.print();
        System.out.println();
        System.out.println("Memory consumption with flyweight: ");
        System.out.println("Total memory consumed by trees:  " +
                ((Tree.SIZE + TreeType.SIZE) * TREE_TO_DRAW) / 1024 / 1024+"G");
        System.out.println("************** Finish ******************");
    }
}

package com.tutorial.flyweight.firstSample;

public class MemoryReport {
    private static int totalSize = 0;

    public static void calculate(int objectSize) {
        totalSize += objectSize;
    }

    public static void print() {
        System.out.println("Total Memory: "+(totalSize / 1024) +"B");
    }
}

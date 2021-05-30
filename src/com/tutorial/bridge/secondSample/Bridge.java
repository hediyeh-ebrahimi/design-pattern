package com.tutorial.bridge.secondSample;

public class Bridge {
    public static void main(String[] args) {

        Color red = new Red();
        Shape redCircle = new Circle(red);
        redCircle.applyColor();
        redCircle.draw();
    }
}

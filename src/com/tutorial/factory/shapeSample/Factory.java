package com.tutorial.factory.shapeSample;

public class Factory {
    public static void main(String[] args) {
        System.out.println("Factory Pattern Start");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape test = shapeFactory.getShape("test");
        test.draw();


    }
}

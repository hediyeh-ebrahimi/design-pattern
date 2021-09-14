package com.tutorial.abstractFactory.secondSample;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryProducer shapeFactoryProducer = new ShapeFactoryProducer();
        AbstractShapeFactory factory = shapeFactoryProducer.getFactory(true);
        Shape square = factory.getShape("square");
        square.draw();
        factory.getShape("rectangle");

        AbstractShapeFactory factory1 = shapeFactoryProducer.getFactory(false);
        Shape rectangle = factory1.getShape("rectangle");
        rectangle.draw();

    }
}

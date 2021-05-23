package com.tutorial.factory.shapeSample;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory {
    public Shape getShape(String type) {
        Shape shape;
        switch (type.toLowerCase()) {
            case "circle":
                shape = new Circle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            default:
                throw new NotImplementedException();
        }
        return shape;
    }
}

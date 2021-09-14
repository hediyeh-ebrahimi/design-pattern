package com.tutorial.abstractFactory.secondSample;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String type) {
        switch (type.toLowerCase()){
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                throw new NotImplementedException();
        }
    }
}

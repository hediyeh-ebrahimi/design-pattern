package com.tutorial.abstractFactory.secondSample;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RoundedShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String type) {
        switch (type.toLowerCase()){
            case "square":
                return new RoundedSquare();
            case "rectangle":
                return new RoundedRectangle();
            default:
                throw new NotImplementedException();
        }
    }
}

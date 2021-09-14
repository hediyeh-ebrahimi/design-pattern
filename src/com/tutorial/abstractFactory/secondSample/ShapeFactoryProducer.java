package com.tutorial.abstractFactory.secondSample;

public class ShapeFactoryProducer {
    public AbstractShapeFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }

    }
}

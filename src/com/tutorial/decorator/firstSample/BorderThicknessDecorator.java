package com.tutorial.decorator.firstSample;

import com.tutorial.decorator.firstSample.Shape;
import com.tutorial.decorator.firstSample.ShapeDecorator;

public class BorderThicknessDecorator extends ShapeDecorator {
    private float thickness;

    public BorderThicknessDecorator(Shape shape, float thickness) {
        super(shape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Thickness draw() " + this.thickness);
    }

    @Override
    public void resize() {
        shape.resize();
    }
}

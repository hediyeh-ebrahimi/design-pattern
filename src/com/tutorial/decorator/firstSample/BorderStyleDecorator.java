package com.tutorial.decorator.firstSample;

public class BorderStyleDecorator extends ShapeDecorator {
    private LineStyle lineStyle;
    public BorderStyleDecorator(Shape shape, LineStyle lineStyle) {
        super(shape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line Style draw() " + this.lineStyle);
    }

    @Override
    public void resize() {
        shape.resize();
    }
}

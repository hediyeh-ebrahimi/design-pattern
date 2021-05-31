package com.tutorial.decorator.firstSample;

public class BorderColorDecorator extends ShapeDecorator {
    private Color color;

    public BorderColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color draw() " + this.color);

    }

    @Override
    public void resize() {
        shape.draw();
    }
}

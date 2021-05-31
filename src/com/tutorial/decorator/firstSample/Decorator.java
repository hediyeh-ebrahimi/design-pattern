package com.tutorial.decorator.firstSample;


/*
 * functionality runtime added to object
 * inheritance => compile time we have behavior of extends class
 * structural pattern
 * decorator implements abstract class or component, decorator instance of component has
 * different name wrapper
 * use composition in this pattern
 * examples => inputestrea,checkedList
 * */
public class Decorator {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.resize();
        rectangle.draw();


        //decorator
        Shape circleNew = new FillColorDecorator(
                new BorderStyleDecorator(
                        new BorderThicknessDecorator(
                                new BorderColorDecorator(circle, Color.Green)
                                , 4.5f)
                        , LineStyle.Dash)
                , Color.Blue);
        circleNew.draw();
    }
}

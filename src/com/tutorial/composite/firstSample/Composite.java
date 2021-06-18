package com.tutorial.composite.firstSample;

/*
 * structural pattern
 * composite compose objects in term of tree structure as whole as hirarchy
 *
 *  component(base object) - leaf (implement from base object) - composite (references to leafs)
 *
 *  when we use => we do sth on all objects that are one kind
 * */
public class Composite {
    public static void main(String[] args) {
        CompoundShape compoundShape = new CompoundShape();
        compoundShape.addChild(new Circle(10, 12, 3));
        compoundShape.addChild(new Circle(12, 14, 4));
        compoundShape.addChild(new Dot(1, 3));

        compoundShape.draw();
        compoundShape.move(4, 5);
        compoundShape.draw();
    }


}

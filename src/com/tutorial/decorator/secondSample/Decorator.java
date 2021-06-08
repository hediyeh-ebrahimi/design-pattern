package com.tutorial.decorator.secondSample;

public class Decorator {
    public static void main(String[] args) {
        SubmitInputElement submitInputElement = new SubmitInputElement(new Attribute("id","2"),new Attribute(
                "name","btn"));
//        String res = submitInputElement.write();
//        System.out.println(res);


        StyleSheetDecorator styleSheetDecorator = new StyleSheetDecorator(
                submitInputElement,new Attribute("color","red")
        );
        String res = styleSheetDecorator.write();
        System.out.println(res);
    }
}

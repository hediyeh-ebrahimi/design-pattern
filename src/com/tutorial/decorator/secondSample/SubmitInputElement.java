package com.tutorial.decorator.secondSample;

import java.util.Arrays;

public class SubmitInputElement extends Render {

    private Attribute[] attributes;

    public SubmitInputElement() {
    }

    public SubmitInputElement(Attribute... attributes) {
        this.attributes = attributes;
    }

    @Override
    public String write() {
        String res = Arrays.stream(attributes).filter(attribute -> attribute.getName() != null && attribute.getValue() != null)
                .map(attribute -> attribute.getName()+"='"+attribute.getValue()+"' ")
                .reduce(" ",String::concat);
        return "<input type='submit' "+res+"/>";
    }
}

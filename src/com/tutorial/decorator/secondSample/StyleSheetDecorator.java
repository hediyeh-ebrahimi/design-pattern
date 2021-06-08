package com.tutorial.decorator.secondSample;

import java.util.Arrays;

public class StyleSheetDecorator extends Render {
    private Attribute[] attributes;
    private Render render;

    public StyleSheetDecorator(Render render, Attribute... attributes) {
        this.attributes = attributes;
        this.render = render;
    }

    @Override
    public String write() {
        String res = Arrays.stream(attributes).filter(
                attribute -> attribute.getValue() != null && attribute.getName() != null)
                .map(attribute -> attribute.getName() + ":" + attribute.getValue() + ";")
                .reduce(" ", String::concat);
        String styles = null;
        if (res != null) styles = "style=\"" + res + "\"";

        return "<div class='form-input' " + styles + ">"+render.write()+"</div>";
    }
}

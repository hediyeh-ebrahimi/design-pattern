package com.tutorial.interpreter.firstSample;

import java.util.Map;

public class Variable implements Expression{
    private String name;

    public Variable(final String name) {
        this.name = name;
    }

    @Override
    public int interpret( final Map<String, Expression> context) {
        if(context.get(name) == null){
            return 0;
        }
        return context.get(name).interpret(context);
    }
}

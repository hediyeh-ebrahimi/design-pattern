package com.tutorial.interpreter.firstSample;

import java.util.Map;

public class Minus implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Minus(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret(final Map<String, Expression> variables) {
        return this.leftExpression.interpret(variables) - this.rightExpression.interpret(variables);
    }
}

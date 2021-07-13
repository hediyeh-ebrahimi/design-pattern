package com.tutorial.interpreter.firstSample;

import java.util.Map;

public class Plus implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Plus(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftExpression.interpret(variables) + rightExpression.interpret(variables);
    }
}

package com.tutorial.interpreter.firstSample;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(final String expression) {
        final Stack<Expression> expressionStack = new Stack<>();
        for (final String s : expression.split(" ")) {
            if (s != null && !s.isEmpty()) {
                switch (s) {
                    case "+":
                        final Expression addExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                        expressionStack.push(addExpression);
                        break;
                    case "-":
                        final Expression subExpression = new Minus(expressionStack.pop(), expressionStack.pop());
                        expressionStack.push(subExpression);
                        break;
                    default:
                        expressionStack.push(new Variable(s));
                        break;

                }

            }

        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}

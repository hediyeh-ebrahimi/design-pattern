package com.tutorial.interpreter.firstSample;

import java.util.Map;

public interface Expression {
    int interpret(Map<String,Expression> context);
}

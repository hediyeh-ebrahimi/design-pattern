package com.tutorial.interpreter.secondSample;

import java.time.LocalDate;

public interface AbstractDateFormatter {

    String interpret(LocalDate date,String context);
}

package com.tutorial.interpreter.secondSample;

import java.time.LocalDate;

import static java.lang.String.format;

public class YearDateFormatter implements AbstractDateFormatter {
    @Override
    public String interpret(LocalDate date, String context) {
        return context.replace("YYYY",String.valueOf(date.getYear()));
    }
}

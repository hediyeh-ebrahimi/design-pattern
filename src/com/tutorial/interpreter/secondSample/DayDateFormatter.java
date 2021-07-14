package com.tutorial.interpreter.secondSample;

import java.time.LocalDate;

import static java.lang.String.format;

public class DayDateFormatter implements AbstractDateFormatter {
    @Override
    public String interpret(LocalDate date, String context) {
        return context.replace("DD",String.valueOf(date.getDayOfMonth()));
    }
}

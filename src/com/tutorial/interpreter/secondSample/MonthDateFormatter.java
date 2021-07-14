package com.tutorial.interpreter.secondSample;

import java.time.LocalDate;

import static java.lang.String.format;

public class MonthDateFormatter implements AbstractDateFormatter {
    @Override
    public String interpret(LocalDate date, String context) {
        return context.replace("MM",String.valueOf(date.getMonthValue()));
    }
}

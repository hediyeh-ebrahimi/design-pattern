package com.tutorial.interpreter.secondSample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateFormatter implements AbstractDateFormatter {
    private List<AbstractDateFormatter> dateFormatters ;

    public DateFormatter() {
        this.dateFormatters = new ArrayList<>();
    }
    public void addDateFormatter(AbstractDateFormatter abstractDateFormatter){
        this.dateFormatters.add(abstractDateFormatter);
    }

    @Override
    public String interpret(LocalDate date, String context) {
        for (AbstractDateFormatter dateFormatter : this.dateFormatters) {
            context = dateFormatter.interpret(date,context);
        }
        return context;
    }
}

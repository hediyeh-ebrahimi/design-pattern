package com.tutorial.interpreter.secondSample;

import java.time.LocalDate;

/*
* behavioral design pattern
* regular expression customize write for my ourselves
* grammar must be simple
*  method interpret in abstract class
*  terminal , none terminal expressions
* */
public class Main {
    public static void main(String[] args) {
        AbstractDateFormatter year = new YearDateFormatter();
        AbstractDateFormatter month = new MonthDateFormatter();
        AbstractDateFormatter day = new DayDateFormatter();

        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.addDateFormatter(year);
        dateFormatter.addDateFormatter(month);
        dateFormatter.addDateFormatter(day);

        System.out.println(dateFormatter.interpret(LocalDate.now(),"YYYY,MM,DD"));



    }
}

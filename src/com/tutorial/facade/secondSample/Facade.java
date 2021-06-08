package com.tutorial.facade.secondSample;

/*
 *  difficult api -> use facade
 * simplify using interface
 * decrease complexity
 * facade is input gate
 * facade dispatch to other class
 * facade =>composition , not have inheritance
 * */
public class Facade {
    public static void main(String[] args) {

        CalculationFacade calculationFacade = new CalculationFacade();
        double calculate = calculationFacade.calculate(new Object());
        System.out.println(calculate);

    }
}

package com.tutorial.facade.secondSample;

public class CalculationFacade {
    private BasePremiumCalculation basePremiumCalculation;
    private DiscountCalculation discountCalculation;
    private TaxCalculation taxCalculation;

    public CalculationFacade() {
        this.basePremiumCalculation = new BasePremiumCalculation();
        this.discountCalculation = new DiscountCalculation();
        this.taxCalculation = new TaxCalculation();
    }

    public double calculate(Object obj) {
        return basePremiumCalculation.calcPremium(obj) -
                discountCalculation.calcDiscount(obj)
                + taxCalculation.calcTax(obj);
    }
}

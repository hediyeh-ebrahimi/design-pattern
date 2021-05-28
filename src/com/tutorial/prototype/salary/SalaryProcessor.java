package com.tutorial.prototype.salary;

import java.util.Random;

public class SalaryProcessor implements Cloneable {
    private String formula;
    private String personName;
    private float salary = 0f;

    public SalaryProcessor() {
        System.out.println("Initializing Salary Processor ... ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        formula = "Loaded Formula";
        System.out.println("Salary Processor Initialized.");
    }

    public SalaryProcessor(String personName) {
        System.out.println("Initializing Salary Processor ... ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        formula = "Loaded Formula";
        System.out.println("Salary Processor Initialized.");
        this.personName= personName;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void calculate(){
        Random random = new Random();
        salary = random.nextFloat();
    }

    public SalaryProcessor(String formula, String personName) {
        this.formula = formula;
        this.personName = personName;
    }


    @Override
    public String toString() {
        return "SalaryProcessor{" +
                "formula='" + formula + '\'' +
                ", personName='" + personName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected SalaryProcessor clone(){
        try {
            return (SalaryProcessor) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

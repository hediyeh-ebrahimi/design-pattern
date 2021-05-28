package com.tutorial.prototype.salary;

public class SalaryProcessorCache {
    private static SalaryProcessor salaryProcessor ;
    static {
        salaryProcessor = new SalaryProcessor();
    }

    public static SalaryProcessor getProcessor(){
        return salaryProcessor.clone();
    }
}

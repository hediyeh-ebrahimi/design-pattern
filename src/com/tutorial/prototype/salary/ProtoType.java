package com.tutorial.prototype.salary;

/*
 * create object has high cost , calculation constructors
 *  prototype => clone
 * when we use clone => constructor not called some fields not initialize
 * clone = shallow copy
 * clone , registry design pattern
 * */
public class ProtoType {
    public static void main(String[] args) {
//        SalaryProcessor salaryProcessor = new SalaryProcessor("hediyeh");
//        salaryProcessor.calculate();
//        System.out.println(salaryProcessor.toString());
//
//        SalaryProcessor salaryProcessor0 = salaryProcessor.clone();
//        salaryProcessor0.calculate();
//        System.out.println(salaryProcessor0.toString());


        SalaryProcessor salaryProcessor = SalaryProcessorCache.getProcessor();
        salaryProcessor.setPersonName("hediyeh");
        salaryProcessor.calculate();
        System.out.println(salaryProcessor.toString());

        SalaryProcessor salaryProcessor0 = SalaryProcessorCache.getProcessor();
        salaryProcessor0.setPersonName("sara");
        salaryProcessor0.calculate();
        System.out.println(salaryProcessor0.toString());


    }
}

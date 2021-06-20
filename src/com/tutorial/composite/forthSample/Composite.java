package com.tutorial.composite.forthSample;

import java.util.List;

public class Composite {
    public static void main(String[] args) {
        Employee ceo = new Employee("ceo", "ceo", 5000);
        Employee headMarketing = new Employee("headMarketing", "headMarketing", 2500);
        ceo.add(headMarketing);
        Employee headSales = new Employee("headSales", "headSales", 2500);
        ceo.add(headSales);

        Employee clerk1 = new Employee("clerk1", "clerk", 1000);
        Employee clerk2 = new Employee("clerk2", "clerk", 1000);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        Employee salesExecutor = new Employee("salesExecutor1", "salesExecutor", 500);
        Employee salesExecutor1 = new Employee("salesExecutor2", "salesExecutor", 500);
        headSales.add(salesExecutor);
        headSales.add(salesExecutor1);

        List<Employee> subordinates = ceo.getSubordinates();
         subordinates.forEach(System.out::println);
    }
}

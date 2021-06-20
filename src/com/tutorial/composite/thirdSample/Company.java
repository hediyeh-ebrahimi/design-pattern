package com.tutorial.composite.thirdSample;

import java.util.ArrayList;
import java.util.List;

public class Company implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }

    }
}

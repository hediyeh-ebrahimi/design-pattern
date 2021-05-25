package com.tutorial.builder.secondSample;

public class _Builder {

    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder("0935","hedi@gmil.com")
                .setAge(29).build();

        System.out.println(employee);
    }
}

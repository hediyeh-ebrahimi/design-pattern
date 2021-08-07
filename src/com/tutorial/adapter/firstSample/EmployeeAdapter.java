package com.tutorial.adapter.firstSample;

public class EmployeeAdapter extends Employee {
    private EmployeeDto employeeDto;

    public EmployeeAdapter(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public Long getId() {
        return this.employeeDto.getId();
    }

    @Override
    public String getFullName() {
        return this.employeeDto.getFirstName() + " " +this.employeeDto.getLastName();
    }

    @Override
    public String getCode() {
        return this.employeeDto.getCode();
    }

}

package com.tutorial.adapter.firstSample;

import java.util.Arrays;
import java.util.List;

/*
* structural design pattern
* adaptee,adapter,client
* arrays->list
* it is convertor between 2 class(convertor)
* */
public class Main {
    public static void main(String[] args) {

        Integer[] arrays = new Integer[]{1,2,3};
        List<Integer> integers = Arrays.asList(arrays);
        integers.stream().forEach(System.out::print);

        System.out.println("---------------------");

        EmployeeDao employeeDao = new EmployeeDao();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setCode("123");
        employeeDto.setFirstName("hediyeh");
        employeeDto.setLastName("ebrahimi");
        employeeDto.setId(1l);
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeDto);
        System.out.println(employeeAdapter.getCode());
        employeeDao.save(employeeAdapter);

    }
}

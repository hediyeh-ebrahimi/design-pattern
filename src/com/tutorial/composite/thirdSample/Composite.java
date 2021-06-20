package com.tutorial.composite.thirdSample;

public class Composite {

    public static void main(String[] args) {
        Company company = new Company();

        Company devCompany = new Company();
        devCompany.addEmployee(new Developer("ebrahimi",1,"developer"));
        devCompany.addEmployee(new Developer("kord",2,"developer"));

        Company managerCompany = new Company();
        managerCompany.addEmployee(new Manager("akbari",3,"manager"));

        company.addEmployee(devCompany);
        company.addEmployee(managerCompany);

        company.showEmployeeDetails();

    }
}

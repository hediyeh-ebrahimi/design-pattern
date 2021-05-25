package com.tutorial.builder.firstSample;
/*
*  1- private constructor , builder input
* 2- class without setter
* */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private String phoneNumber;
    private String email;

    protected Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
        this.phoneNumber = personBuilder.getPhoneNumber();
        this.email = personBuilder.getEmail();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

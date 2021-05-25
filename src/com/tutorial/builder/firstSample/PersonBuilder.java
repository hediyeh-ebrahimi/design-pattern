package com.tutorial.builder.firstSample;

/*
* 1- constructor for mandatory fields
* 2- setter by return class
* 3- build method -> out must be as object  input is this class
* */
public class PersonBuilder {

    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private String phoneNumber;
    private String email;

    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
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


    public Person build(){
        return new Person(this);
    }
}

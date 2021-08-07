package com.tutorial.adapter.firstSample;

public class Employee {
    private Long id;
    private String fullName;
    private String code;

    public Employee() {
    }

    public Employee(Long id, String fullName, String code) {
        this.id = id;
        this.fullName = fullName;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

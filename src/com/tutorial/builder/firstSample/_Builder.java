package com.tutorial.builder.firstSample;;


/*
* lots of field for creating object
*
* */
public class _Builder {
    public static void main(String[] args) {
        Person person = new PersonBuilder("hediyeh","ebrahimi").setAge(28).setPhoneNumber("09356").build();
        System.out.println(person.toString());
    }
}

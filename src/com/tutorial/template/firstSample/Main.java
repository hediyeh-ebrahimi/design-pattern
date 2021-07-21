package com.tutorial.template.firstSample;

/*
*  we reuse codes by this pattern
* */
public class Main {
    public static void main(String[] args) {
        SoftwareEngineering softwareEngineering = new SoftwareEngineering();
        softwareEngineering.study();

        System.out.println("");

        ElectricalEngineering electricalEngineering = new ElectricalEngineering();
        electricalEngineering.study();
    }
}

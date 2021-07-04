package com.tutorial.iterator.secondSample;

/*
*  sequential
* behavioral
* */
public class Main {
    public static void main(String[] args) {
        PeopleCollection peopleCollection = new PeopleCollection();
        Iterator iterator = peopleCollection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

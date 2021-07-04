package com.tutorial.iterator.secondSample;

public class PeopleCollection implements Aggregate {

    String[] people = {"hediyeh","ali","reza"};
    @Override
    public Iterator getIterator() {
        return new PeopleIterator();
    }

    private class PeopleIterator implements Iterator{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index != people.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return people[index++];
            }
            return null;
        }
    }
}

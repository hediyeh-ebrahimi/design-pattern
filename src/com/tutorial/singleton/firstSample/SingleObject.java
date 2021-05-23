package com.tutorial.singleton.firstSample;

/*
 * one object
 * control resource
 * spring beans,logger,runtime,database
 * lazy loading
 * */
public class SingleObject {

    private static SingleObject singleObject = null;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        //lazy initialize
        if (singleObject == null) {
            //double check locking
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }


    public void getMessage() {
        System.out.println("SingletonObject getMessage method");
    }
}

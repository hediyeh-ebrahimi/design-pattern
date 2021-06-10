package com.tutorial.flyweight.secondSample;

/*
* optimize use of memory (ram)
*  flyweight like cache
*  immutable objects (string , wrapper class,integer)
* factory design pattern must be use
* client -> factory-> flyweight
* */
public class FlyWeight {
    public static void main(String[] args) {

        String s1 = "Test"; // String is immutable (new every time)
        String s2 = "Test";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // they are the same because of both string are the same Test = Test


        Integer val1 = Integer.valueOf(+127); // integer cache
        Integer val2 = Integer.valueOf(+127);
        System.out.println(System.identityHashCode(val1));
        System.out.println(System.identityHashCode(val2));

        System.out.println("----------------------------------");

        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartment(1);
        System.out.println(department.hashCode());
        Department department1 = departmentRepository.getDepartment(1);
        System.out.println(department1.hashCode());


    }
}

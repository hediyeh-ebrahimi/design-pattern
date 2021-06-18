package com.tutorial.proxy;

public class Calc {

    public int plus(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) throws Exception {
        //Reflection
        Class<?> calcClass = Class.forName("com.tutorial.proxy.Calc");
        Object calcObj = calcClass.newInstance();
        Object plus = calcClass.getMethod("plus", int.class, int.class).invoke(calcObj, 12, 14);
        System.out.println("plus: " + plus);
    }
}

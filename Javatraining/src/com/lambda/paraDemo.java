// File name: ParaDemo.java
package com.lambda;

@FunctionalInterface
interface Withpara {
    int hello(int a);
}

public class paraDemo {
    public static void main(String[] args) {
        Withpara w = (a) -> {
            System.out.println("The value of a is: " + a);
            return a;
        };

        int result = w.hello(10);
        System.out.println("Returned value: " + result);
    }
}

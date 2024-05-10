package com.TrendyTrove.Fashion;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;

interface Greeting {
    void greet();
}
public class Test {

    public static void main(String[] args) {

        // Using an anonymous class to implement the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, world!");
            }
        };

        // Calling the greet() method of the anonymous class
        greeting.greet(); // Output: Hello, world!

    }

}

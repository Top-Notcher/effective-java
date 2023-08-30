package com.example.effectivejava.chapter04.item19.implSpec;

/**
 * Example class for java documentation for extendable class
 */
public class ExtendableClass {

    /**
     * This method can be overridden to print any message
     *
     * @implSpec
     * Please use System.out.println()
     */
    public void doSomething() {
        System.out.println("hello");
    }
}

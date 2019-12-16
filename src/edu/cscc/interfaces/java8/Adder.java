package edu.cscc.interfaces.java8;

public interface Adder {

    //As of Java 8 interfaces can provide a default
    //implementation. The rule for this default
    //implementation is that it can only use parameters
    //or other interface methods.
    default int add(int value1, int value2) {
        return value1 + value2;
    }
}

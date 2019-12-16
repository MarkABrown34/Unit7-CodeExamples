package edu.cscc.immutability;

public class ImmutabilityExamples {

    public static void main(String[] args) {
        // "final" in Java means that once defined a thing can't be changed.
        final int aFinalValue;  //We can define a final variable without assigning to it.

        aFinalValue = 5; //Once it's assigned we can't reassign it though.
        //aFinalValue = 6; // Uncommenting this line will cause a compiler error.
    }
}

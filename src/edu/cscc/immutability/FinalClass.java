package edu.cscc.immutability;

/**
 * The class name doesn't matter here, but the "final" keyword does.
 * A final class can't be extending via inheritance.
 */
public final class FinalClass {

    private final int finalValue;

    //We can have final parameters as well.
    public FinalClass(final int value) {
        //We can assign a value here because an object is being constructed.
        this.finalValue = value;
    }

    //Getters are permitted. We can read final values whenever we want.
    public int getFinalValue() {
        return this.finalValue;
    }

    //Assigning to a final value outside of the constructor is not allowed.
    //Uncommenting this line will cause a compiler error.
//    public void setFinalValue(int value) {
//        this.finalValue = value;
//    }
}

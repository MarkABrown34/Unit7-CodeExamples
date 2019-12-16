package edu.cscc.immutability;

public class Commercial {

    protected int viewerCount;

    //This method cannot be overridden because it is marked as final.
    public final void showCommercial() {
        System.out.println("Buy our product!");
        viewerCount++;
    }

    //This one can be however.
    public void showViewerStats() {
        System.out.println("Viewers: " + viewerCount);
    }
}

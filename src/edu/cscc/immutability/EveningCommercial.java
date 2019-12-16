package edu.cscc.immutability;

public class EveningCommercial extends Commercial {

    //Notice we can override this method because the super class method is not final.
    @Override
    public void showViewerStats() {
        System.out.println("Evening viewer stats are: " + viewerCount);
    }
}

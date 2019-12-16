package edu.cscc.usingstatic;

public class Commercial {

    //Static variables are available at the class level, not the instance level.
    private static int viewCount;

    public String getNetwork() {
        return network;
    }

    private String network;

    public Commercial(String network) {
        this.network = network;
    }

    public void displayCommercial() {
        System.out.println("Buy our stuff!");
        viewCount++; //Static variables can be accessed in a non-static context.
    }

    //We can declare static methods as well.
    //This method can be called at the class level: Commercial.getViewCount().
    public static int getViewCount() {
        //Can't access "this" in the static context.
        //The following is not valid:
//         this.network; //Uncommenting this line will cause a compiler error

        return viewCount; //We can access static variables and methods however.
    }
}

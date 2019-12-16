package edu.cscc.usingstatic;

import java.util.ArrayList;
import java.util.List;

public class Networks {

    private static List<String> networkList;

    //We can use a static block to initialize static variables.
    //This block gets called once when the class is created (*not* when an new instance is created).
    static {
        networkList = new ArrayList<>();
        networkList.add("Fox");
        networkList.add("NBC");
        networkList.add("ABC");
    }

    public static List<String> getNetworkList() {
        return networkList;
    }
}

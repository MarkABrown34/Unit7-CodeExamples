package edu.cscc.usingstatic;

import java.util.List;

public class StaticExamples {

    public static void main(String[] args) {
        List<String> networks = Networks.getNetworkList();

        Commercial commercial1 = new Commercial(networks.get(0));
        Commercial commercial2 = new Commercial(networks.get(1));

        commercial1.displayCommercial();
        commercial2.displayCommercial();

        System.out.println("View count: " + Commercial.getViewCount());
    }
}

package edu.cscc.interfaces;

public class InterfaceExamples {

    public static void main(String[] args) {

        //Interfaces are types, so an object of a class type which implements the interface
        //can be assigned to a variable of the interface type.
        Configuration databaseConfiguration = new DatabaseConfiguration();
        System.out.println(databaseConfiguration.readConfig(Configuration.CONFIG_KEY));
        databaseConfiguration.writeConfig(Configuration.CONFIG_KEY, "config value");

        Configuration fileConfiguration = new FileConfiguration();
        System.out.println(fileConfiguration.readConfig(Configuration.CONFIG_KEY));
        fileConfiguration.writeConfig(Configuration.CONFIG_KEY, "config value");

        IntegerCalculator calculator = new IntegerCalculator();
        System.out.println("2 + 2 = " + calculator.add(2, 2));
    }
}

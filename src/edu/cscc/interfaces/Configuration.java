package edu.cscc.interfaces;

/**
 * Interfaces act as "contracts" between classes.
 */
public interface Configuration {

    //We can declare variables. These are static final by default.
    String CONFIG_KEY = "config key";

    //Methods usually don't have a body (as of Java 8 there are exception to this rule)
    String readConfig(String key);

    void writeConfig(String key, String value);
}

package edu.cscc.interfaces;

/**
 * By using interfaces we can have different classes which
 * all implement the same contract.
 */
public class DatabaseConfiguration implements Configuration {
    @Override
    public String readConfig(String key) {
        return "Getting value for " + key + " from the database.";
    }

    @Override
    public void writeConfig(String key, String value) {
        System.out.println("Writing value: " + value + " to database for key: " + key);
    }
}

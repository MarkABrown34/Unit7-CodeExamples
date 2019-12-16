package edu.cscc.interfaces;

/**
 * This implementation of Configuration theoretically
 * reads from a file instead of a database.
 */
public class FileConfiguration implements Configuration {
    @Override
    public String readConfig(String key) {
        return "Getting value for " + key + " from the file.";
    }

    @Override
    public void writeConfig(String key, String value) {
        System.out.println("Writing value: " + value + " to file for key: " + key);
    }
}

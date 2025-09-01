package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppSettings implements Serializable {
    private static volatile AppSettings instance;

    private volatile Properties props = new Properties();

    // public AppSettings() { } // should not be public for true singleton

    public static AppSettings getInstance() { // lazy loading 
        if (instance == null) {
            synchronized (AppSettings.class) { // should be synchronized for thread safety ( for more safety , we could use volatile )
                if (instance == null) {
                    instance = new AppSettings();
                }
            }
        }
        return instance;
    }

    public void loadFromFile(Path file) {
        Properties newProps = new Properties();
        try (InputStream in = Files.newInputStream(file)) {
            newProps.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        props = newProps;
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}

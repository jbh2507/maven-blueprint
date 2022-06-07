package org.example.mavenblueprint;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

@Slf4j
public class Property {

    private static final Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(Property.class.getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            log.error("Property load fail: {}", "application.properties");
        }
    }

    public static Optional<String> getProperty(String propName) {
        return Optional.ofNullable(properties.getProperty(propName));
    }
}

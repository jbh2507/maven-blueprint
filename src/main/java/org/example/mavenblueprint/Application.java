package org.example.mavenblueprint;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {
        try {
            init();
            run();
        } catch (Exception e) {
            log.error("ERROR! APPLICATION END WITH: ", e);
        }
    }

    public static void run() {
        log.info("APPLICATION RUNNING");

    }

    private static void init() {
        log.info("APPLICATION INITIALIZING");

    }
}

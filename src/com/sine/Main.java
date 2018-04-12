package com.sine;

import java.util.logging.Logger;

public class Main {
    private static Logger log;

    static {
        if (System.getProperty("java.util.logging.config.file") == null)
            System.setProperty("java.util.logging.config.file", "logging.properties");
        log = Logger.getLogger("");
    }

    public static void main(String[] args) {
        System.out.println("信息");
        log.info("信息");
    }
}

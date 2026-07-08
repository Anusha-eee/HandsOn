package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
    public static void main(String[] args) {
        logger.info("Logging Application Started.");
        logger.warn("This is a warning message indicating a potential issue.");
        logger.error("This is an error message indicating a critical failure.");
        String taskName = "Week 1 Exercises";
        int taskIndex = 4;
        logger.info("Processing task '{}' (Index: {})...", taskName, taskIndex);
    }
}

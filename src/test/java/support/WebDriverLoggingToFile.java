package support;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class WebDriverLoggingToFile {
    public static void main(String[] args) {
        // Creating a Logger instance
        Logger logger = Logger.getLogger("WebDriverLogs");

        try {
            // Setting up a file handler to direct logs to a file
            FileHandler fileHandler = new FileHandler("webdriver_logs.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Adding the file handler to the logger
            logger.addHandler(fileHandler);

            // Set the log level (FINEST for more details, INFO for less detailed logs)
            logger.setLevel(Level.FINEST);

            // Example usage: logging some messages
            logger.info("Starting WebDriver...");
            // ... perform WebDriver operations

            logger.info("WebDriver operation complete.");

            // Close the file handler when done
            fileHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
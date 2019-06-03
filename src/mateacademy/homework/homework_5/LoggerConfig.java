package mateacademy.homework.homework_5;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerConfig {

    private static void configureLogging() {
        Logger logClassA = Logger.getLogger("org.stepic.java.logging.ClassA");
        logClassA.setLevel(Level.ALL);

        Logger logClassB = Logger.getLogger("org.stepic.java.logging.ClassB");
        logClassB.setLevel(Level.WARNING);

        Logger logger = Logger.getLogger("org.stepic.java");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        consoleHandler.setFormatter(new XMLFormatter());
        logger.addHandler(consoleHandler);
    }
}

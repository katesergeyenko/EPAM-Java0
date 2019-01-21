package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.logger;

public class ConsoleLogger implements Logger.Loggable {
    private org.apache.log4j.Logger logger;

    public ConsoleLogger () {
        //logger = org.apache.log4j.Logger.getLogger(name);
        logger = org.apache.log4j.Logger.getLogger("consoleLogger");
    }

    @Override
    public void trace(String string) {
        logger.trace(string);
    }

    public void debug(String string) {
        logger.debug(string);
    }

    public void info(String string) {
        logger.info(string);
    }

    public void warn(String string) {
        logger.warn(string);
    }

    public void error(String string) {
        logger.error(string);
    }

    public void fatal(String string) {
        logger.fatal(string);
    }
}

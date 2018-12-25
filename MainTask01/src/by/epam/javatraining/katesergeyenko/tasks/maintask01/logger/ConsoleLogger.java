package by.epam.javatraining.katesergeyenko.tasks.maintask01.logger;

public class ConsoleLogger implements Logger.ILogger {
    private org.apache.log4j.Logger logger;

    public ConsoleLogger (String name) {
        logger = org.apache.log4j.Logger.getLogger(name);
    }

    @Override
    public void Log(String string) {
        logger.debug(string);
    }
}

package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.logger;

public class FileLogger implements Loggable {
    private org.apache.log4j.Logger logger;

    public FileLogger () {
        //logger = org.apache.log4j.Loggable.getLogger(name);
        logger = org.apache.log4j.Logger.getLogger("fileLogger");
        //logger.addAppender(new FileAppender());
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


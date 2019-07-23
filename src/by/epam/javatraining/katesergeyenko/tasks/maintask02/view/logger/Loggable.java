package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.logger;

public interface Loggable {
    void trace(String string);
    void debug(String string);
    void info(String string);
    void warn(String string);
    void error(String string);
    void fatal(String string);
}
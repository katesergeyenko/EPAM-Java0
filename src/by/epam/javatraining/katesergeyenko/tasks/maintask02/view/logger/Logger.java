package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.logger;

public class Logger {
    public interface Loggable {
        public void trace(String string);
        public void debug(String string);
        public void info(String string);
        public void warn(String string);
        public void error(String string);
        public void fatal(String string);
    }
}
package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class LogicalException extends SoundRecordingException {
    public LogicalException() {
        super(LogicalException.class.getSimpleName());
    }

    public LogicalException(String string) {
        super(string);
    }
}

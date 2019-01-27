package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class TechnicalException extends SoundRecordingException {
    public TechnicalException() {
        super(TechnicalException.class.getSimpleName());
    }

    public TechnicalException(String string) {
        super(string);
    }
}

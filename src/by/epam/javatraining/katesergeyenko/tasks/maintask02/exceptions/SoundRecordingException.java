package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class SoundRecordingException extends Exception {
    public SoundRecordingException() {
        super(SoundRecordingException.class.getSimpleName());
    }

    public SoundRecordingException(String string) {
        super(string);
    }
}

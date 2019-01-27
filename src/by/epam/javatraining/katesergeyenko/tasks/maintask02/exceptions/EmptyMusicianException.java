package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class EmptyMusicianException extends LogicalException {
    public EmptyMusicianException() {
        super(EmptyMusicianException.class.getSimpleName());
    }
}

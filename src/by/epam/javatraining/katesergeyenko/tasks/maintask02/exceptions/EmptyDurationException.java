package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class EmptyDurationException extends LogicalException {
    public EmptyDurationException() {
        super(EmptyDurationException.class.getSimpleName());
    }
}

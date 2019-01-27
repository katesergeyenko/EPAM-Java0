package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class EmptyNameException extends LogicalException {
    public EmptyNameException() {
        super(EmptyNameException.class.getSimpleName());
    }
}

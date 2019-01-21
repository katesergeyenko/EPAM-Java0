package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class EmptyYearException extends LogicalException {
    public EmptyYearException() {
        super(EmptyYearException.class.getSimpleName());
    }
}

package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class NegativeYearException extends LogicalException {
    public NegativeYearException() {
        super(NegativeYearException.class.getSimpleName());
    }
}

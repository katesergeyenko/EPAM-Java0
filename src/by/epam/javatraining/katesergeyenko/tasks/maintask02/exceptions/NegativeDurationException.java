package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class NegativeDurationException extends LogicalException {
    public NegativeDurationException() {
        super(NegativeDurationException.class.getSimpleName());
    }
}

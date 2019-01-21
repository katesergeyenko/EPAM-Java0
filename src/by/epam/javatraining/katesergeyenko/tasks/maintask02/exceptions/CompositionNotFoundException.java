package by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions;

public class CompositionNotFoundException extends LogicalException {
    public CompositionNotFoundException() {
        super(CompositionNotFoundException.class.getSimpleName());
    }
}

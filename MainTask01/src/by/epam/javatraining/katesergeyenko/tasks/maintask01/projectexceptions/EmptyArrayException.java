package by.epam.javatraining.katesergeyenko.tasks.maintask01.projectexceptions;

public class EmptyArrayException extends ProjectException {
    public EmptyArrayException() {
        super("Array is empty!"); //length == 0
    }
}

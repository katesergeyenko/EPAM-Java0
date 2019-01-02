package by.epam.javatraining.katesergeyenko.tasks.maintask01.projectexceptions;

public class ArrayNotDefinedException extends ProjectException {
    public ArrayNotDefinedException() {
        super("Array is not defined!"); //== null
    }
}

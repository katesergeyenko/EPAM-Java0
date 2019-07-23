package by.epam.javatraining.katesergeyenko.tasks.maintask01.printer;

public class ConsolePrinter implements Printer.IPrinter {
    @Override
    public void printString(String string) { System.out.println(string);
    }
}

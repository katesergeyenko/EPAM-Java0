package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.printer;

public class ConsolePrinter implements Printer.Printable {
    @Override
    public void printString(String string) { System.out.println(string);
    }
}

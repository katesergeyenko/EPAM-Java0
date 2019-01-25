package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.printer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter implements Printable {
    String fileName;

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printString(String string) {
        try {
            File outputFile = new File(fileName);
            PrintWriter printer = new PrintWriter(outputFile);
            printer.write(string + "\n");
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

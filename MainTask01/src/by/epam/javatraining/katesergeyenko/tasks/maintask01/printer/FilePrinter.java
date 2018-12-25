package by.epam.javatraining.katesergeyenko.tasks.maintask01.printer;

import java.io.*;

public class FilePrinter implements Printer.IPrinter {
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

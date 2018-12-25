package by.epam.javatraining.katesergeyenko.tasks.maintask01.scanner;

import java.io.*;

public class FileScanner implements Scanner.IScanner {
    String fileName;

    public FileScanner(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String scanString() {
        String string = "";

        try {
            File inputFile = new File(fileName);
            java.util.Scanner scanner = new java.util.Scanner(inputFile);
            while (scanner.hasNextLine()) {
                string += scanner.nextLine() + " ";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return string;
    }
}

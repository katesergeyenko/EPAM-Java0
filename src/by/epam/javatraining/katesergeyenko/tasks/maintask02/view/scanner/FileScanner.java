package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class FileScanner implements Scanner.Scannable {
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

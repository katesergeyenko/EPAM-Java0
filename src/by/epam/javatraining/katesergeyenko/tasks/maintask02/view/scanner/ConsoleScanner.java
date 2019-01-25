package by.epam.javatraining.katesergeyenko.tasks.maintask02.view.scanner;

public class ConsoleScanner implements Scannable {
    @Override
    public String scanString() {
        String string = "";
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (scanner.hasNextLine()) {
            string += scanner.nextLine() + " ";
        }

        return string;
    }
}

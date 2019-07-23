package by.epam.javatraining.katesergeyenko.tasks.maintask01.scanner;

public class ConsoleScanner implements Scanner.IScanner {
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

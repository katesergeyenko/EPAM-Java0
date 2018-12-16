public class ConsolePrinter {
    public static void Print(String string) {
        System.out.println(string);
    }

    public static void PrintSeparator(String separator) {
        Print("\n**********" + separator + "**********");
    }
}

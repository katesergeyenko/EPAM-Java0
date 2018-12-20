public class Test5Task {
    public static void main(String[] args) {
        ConsolePrinter.PrintSeparator("Factorial");
        int factorial = Factorial.calculateFactorial(10);
        ConsolePrinter.Print(Factorial.GenerateResultMessage(factorial));

        ConsolePrinter.PrintSeparator("Fibonacci");
        int fibonacci = Fibonacci.calculateFibonacciNumber(5);
        ConsolePrinter.Print(Fibonacci.GenerateResultMessage(fibonacci));
    }
}

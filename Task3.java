public class Task3 {
    public static void main(String[] args) {
        //Task 1
        ConsolePrinter.PrintSeparator("Task 1");
        ConsolePrinter.Print(
                NumberOfHeadsAndEyesOfDragon.GenerateResultMessage(
                        NumberOfHeadsAndEyesOfDragon.GetNumberOfHeads(600),
                        NumberOfHeadsAndEyesOfDragon.GetNumberOfEyes(
                                NumberOfHeadsAndEyesOfDragon.GetNumberOfHeads(600)
                        )
                )
        );

        //Task 2
        ConsolePrinter.PrintSeparator("Task 2");
        ConsolePrinter.Print(
                TriangleChecker.GenerateResultMessage(
                        TriangleChecker.CheckTriangle(
                            1, 2,
                            3.5, 4,
                            5.5, 6
                        )
                )
        );

        //Task 3
        ConsolePrinter.PrintSeparator("Task 3");
        try {
            // 14
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowel("B")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithIfElse("a")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithSwitch("c")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithFor("E")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithWhile("p")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithTernary("Y")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithStringContains("t")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithStringIndexOf("A")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithHashSetContains("A")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithHashSetIterator("A")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithArrayListFor("A")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithArrayListForEach("A")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithCollectionsFrequency("A")));
            ConsolePrinter.Print(VowelChecker.GenerateResultMessage(VowelChecker.IsVowelWithRegEx("t")));
        } catch (NotCharException e) {
            ConsolePrinter.Print(e.getMessage());
        } catch (NotLetterException e) {
            ConsolePrinter.Print(e.getMessage());
        }

        //Task 4
        ConsolePrinter.PrintSeparator("Task 4");
        ConsolePrinter.Print(MoodSensor.GenerateResultMessage(MoodSensor.GenerateMood()));

        //Task 5
        ConsolePrinter.PrintSeparator("Task 5");
        ConsolePrinter.Print(NextDate.GenerateResultMessage(31, 12, 2015));
    }
}

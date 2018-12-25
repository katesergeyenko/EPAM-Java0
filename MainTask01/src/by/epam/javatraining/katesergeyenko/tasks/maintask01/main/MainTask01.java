/**
 *
 *
 * Created by Kate Sergeyenko
 * Date 23.12.2018
 */

package by.epam.javatraining.katesergeyenko.tasks.maintask01.main;
import java.util.Arrays;

import by.epam.javatraining.katesergeyenko.tasks.maintask01.arraycreator.ArrayCreator;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.arrayprocessor.ArrayProcessor;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.printer.ConsolePrinter;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.printer.Printer;

public class MainTask01 {
    public static void main(String[] args) {
        double[] array = ArrayCreator.createRandomArray();
        //double[] array = {1, 6, 8, 4.5, 3.9, 0, 0, 1, -10};
        Printer.IPrinter printer = new ConsolePrinter();
        printer.printString(Arrays.toString(array));
        array = ArrayProcessor.sortElementsMergeSortAscending(array, 0, array.length - 1);
        printer.printString(Arrays.toString(array));
    }
}

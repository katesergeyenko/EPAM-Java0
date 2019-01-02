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
import by.epam.javatraining.katesergeyenko.tasks.maintask01.logger.ConsoleLogger;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.logger.FileLogger;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.logger.Logger;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.printer.ConsolePrinter;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.printer.Printer;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.projectexceptions.ArrayNotDefinedException;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.projectexceptions.EmptyArrayException;

public class MainTask01 {
    public static void main(String[] args) {
        try {
            double[] array = ArrayCreator.createRandomArray();
            //double[] array = {1, 6, 8, 4.5, 3.9, 0, 0, 1, -10};
            //double[] array = {};
            Printer.IPrinter printer = new ConsolePrinter();
            printer.printString(Arrays.toString(array));
            array = ArrayProcessor.sortElementsMergeSortAscending(array, 0, array.length - 1);
            printer.printString(Arrays.toString(array));
        } catch (ArrayNotDefinedException ex) {
            ex.getMessage();
        } catch (EmptyArrayException ex) {
            ex.getMessage();
        }
        /*Logger.ILogger consoleLogger = new ConsoleLogger();
        consoleLogger.trace("Trace");
        consoleLogger.debug("Debug");
        consoleLogger.info("Info");
        consoleLogger.warn("Warn");
        consoleLogger.error("Error");
        consoleLogger.fatal("Fatal");*/

        /*Logger.ILogger fileLogger = new FileLogger();
        fileLogger.trace("Trace");
        fileLogger.debug("Debug");
        fileLogger.info("Info");
        fileLogger.warn("Warn");
        fileLogger.error("Error");
        fileLogger.fatal("Fatal");*/
    }
}

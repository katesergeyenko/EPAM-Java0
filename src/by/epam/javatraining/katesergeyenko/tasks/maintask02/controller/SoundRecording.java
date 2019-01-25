package by.epam.javatraining.katesergeyenko.tasks.maintask02.controller;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.LogicalException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.DurationManager;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.view.logger.ConsoleLogger;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.view.logger.Loggable;


public class SoundRecording {
    public static void main(String[] args) {
        try {
            Loggable logger = new ConsoleLogger();
            logger.debug("Hello");

            Duration d3 = new Duration(777);
            Duration d4 = new Duration();
            Duration d1 = new Duration(1, 5, 59);
            Duration d2 = new Duration(4, 55, 1);
            DurationManager.durationsSum(d1, d2);
            logger.debug(d1.toString());

            /*Composition c1 = new Song("A", "B", 2001, 30, Style.ROCK, "Yees!");
            Composition c2 = new Music("C", "D", 2018, 120, MainInstrument.DRUM);
            Composition c3 = new Song("E", "F", 2010, 5000, Style.POP, "No!");
            Composition c4 = new Music("G", "H", 1999, 1, MainInstrument.VIOLIN);*/

            /*Composition c1 = new Song();
            Composition c2 = new Song();
            Composition c3 = new Music();
            Composition c4 = new Music();

            logger.debug(c1.toString());
            logger.debug(c2.toString());*/

            /*Disk d = new Disk("disk1");
            DiskManager.addComposition(d, c3);
            DiskManager.addComposition(d, c4);
            DiskManager.addComposition(d, c2);
            DiskManager.addComposition(d, c1);

            logger.debug(d.toString());;

            DiskSorter.sortByDuration(d);

            logger.debug(d.toString());;*/
        } catch (LogicalException ex) {
            ex.getMessage();
        }
    }
}

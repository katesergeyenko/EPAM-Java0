package by.epam.javatraining.katesergeyenko.tasks.maintask02.controller;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.CompositionNotFoundException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.LogicalException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.SoundRecordingException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.Music;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.maininstrument.MainInstrument;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Song;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.style.Style;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk.Disk;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk.DiskManager;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk.DiskSorter;


public class SoundRecording {
    public static void main(String[] args) {
        try {
            //Logger.Loggable logger = new ConsoleLogger();
            //logger.info("Hello");

        /*Duration d1 = new Duration(1, 5, 59);
        Duration d2 = new Duration(4, 55, 1);
        DurationManager.durationsSum(d1, d2);
        System.out.println(d1);*/

            Composition c1 = new Song("A", "B", 2001, 30, Style.ROCK, "Yees!");
            Composition c2 = new Music("C", "D", 2018, 120, MainInstrument.DRUM);
            Composition c3 = new Song("E", "F", 2010, 5000, Style.POP, "No!");
            Composition c4 = new Music("G", "H", 1999, 1, MainInstrument.VIOLIN);

        /*Composition c1 = new Song();
        Composition c2 = new Song();
        Composition c3 = new Music();
        Composition c4 = new Music();

        System.out.println(c1);
        System.out.println(c2);*/

            Disk d = new Disk("disk1");
            DiskManager.addComposition(d, c3);
            DiskManager.addComposition(d, c4);
            DiskManager.addComposition(d, c2);
            DiskManager.addComposition(d, c1);

            System.out.println(d);

            DiskSorter.sortByDuration(d);

            System.out.println(d);

        /*System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        System.out.println(c3.equals(c4));
        System.out.println(c4.equals(c3));*/
        } catch (LogicalException ex) {
            ex.getMessage();
        }
    }
}

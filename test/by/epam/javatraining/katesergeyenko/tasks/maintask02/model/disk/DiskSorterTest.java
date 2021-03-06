package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.InstrumentType;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.Music;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Song;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Style;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class DiskSorterTest {
    Disk disk;
    Composition c1;
    Composition c2;
    Composition c3;
    Composition c4;
    Composition c5;
    List<Composition> listOfCompositions = new LinkedList<>();
    Disk expected;

    @BeforeMethod
    public void beforeClass() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        c1 = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 4, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        c2 = new Music("The Nutcracker's Adagio", "Tchaikovsky", 1892,
                0, 6, 16, InstrumentType.FLUTE);
        c3 = new Song("Kissing strangers", "DNCE", 2010,
                0, 5, 4, Style.POP,
                "...Open heart, open mind, never know who you'll find...");
        c4 = new Music("For Elise", "Beethoven", 1810,
                0, 3, 36, InstrumentType.PIANO);
        c5 = new Song("Love the way you lie", "Eminem feat. Rihanna", 2010,
                0, 4, 27, Style.RAP, "Some words that I don't know");

        disk = new Disk("The Best Songs", listOfCompositions);

        disk.addComposition(c1);
        disk.addComposition(c2);
        disk.addComposition(c3);
        disk.addComposition(c4);
        disk.addComposition(c5);

        expected = new Disk("The Best Songs");
    }

    // test sortByName(Disk disk)
    @Test
    public void testSortByName() throws EmptyDurationException, NegativeDurationException {
        DiskSorter.sortByName(disk);
        Disk actual = disk;
        expected.addComposition(c1);
        expected.addComposition(c4);
        expected.addComposition(c3);
        expected.addComposition(c5);
        expected.addComposition(c2);
        Assert.assertEquals(actual, expected);
    }

    // test sortByMusician(Disk disk)
    @Test
    public void testSortByMusician() throws EmptyDurationException, NegativeDurationException {
        DiskSorter.sortByMusician(disk);
        Disk actual = disk;
        expected.addComposition(c4);
        expected.addComposition(c3);
        expected.addComposition(c5);
        expected.addComposition(c1);
        expected.addComposition(c2);
        Assert.assertEquals(actual, expected);
    }

    // test sortByYear(Disk disk)
    @Test
    public void testSortByYear() throws EmptyDurationException, NegativeDurationException {
        DiskSorter.sortByYear(disk);
        Disk actual = disk;
        expected.addComposition(c4);
        expected.addComposition(c2);
        expected.addComposition(c1);
        expected.addComposition(c3);
        expected.addComposition(c5);
        Assert.assertEquals(actual, expected);
    }

    // test sortByDuration(Disk disk)
    @Test
    public void testSortByDuration() throws EmptyDurationException, NegativeDurationException {
        DiskSorter.sortByDuration(disk);
        Disk actual = disk;
        expected.addComposition(c4);
        expected.addComposition(c5);
        expected.addComposition(c1);
        expected.addComposition(c3);
        expected.addComposition(c2);
        Assert.assertEquals(actual, expected);
    }
}

package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.InstrumentType;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.Music;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Song;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Style;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class DiskFilterTest {
    Disk disk;
    DiskFilter diskFilter = new DiskFilter();
    Composition c1;
    Composition c2;
    Composition c3;
    Composition c4;
    Composition c5;
    List<Composition> listOfCompositions = new LinkedList<>();

    @BeforeClass
    public void beforeClass() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        c1 = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 14, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        c2 = new Music("The Nutcracker's Adagio", "Tchaikovsky", 1892,
                0, 6, 16, InstrumentType.FLUTE);
        c3 = new Song("Kissing strangers", "DNCE", 2016,
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
    }

    // test filterByName(Disk disk, String low, String high)
    @Test
    public void testFilterByName() throws EmptyNameException, EmptyDurationException, NegativeDurationException {
        Disk actual = new Disk("New Disk", diskFilter.filterByName(disk, "E", "S"));
        Disk expected = new Disk("New Disk");
        expected.addComposition(c3);
        expected.addComposition(c4);
        expected.addComposition(c5);
        Assert.assertEquals(actual, expected);
    }

    // test filterByMusician(Disk disk, String low, String high)
    @Test
    public void testFilterByMusician() throws EmptyNameException, EmptyDurationException, NegativeDurationException {
        Disk actual = new Disk("New Disk", diskFilter.filterByMusician(disk, "A", "K"));
        Disk expected = new Disk("New Disk");
        expected.addComposition(c1);
        expected.addComposition(c3);
        expected.addComposition(c4);
        expected.addComposition(c5);
        Assert.assertEquals(actual, expected);
    }

    // test filterByYear(Disk disk, int low, int high)
    @Test
    public void testFilterByYear() throws EmptyNameException, EmptyDurationException, NegativeDurationException {
        Disk actual = new Disk("New Disk", diskFilter.filterByYear(disk, 2000, 2019));
        Disk expected = new Disk("New Disk");
        expected.addComposition(c3);
        expected.addComposition(c5);
        Assert.assertEquals(actual, expected);
    }

    // test filterByDuration(Disk disk, Duration low, Duration high)
    @Test
    public void testFilterByDuration() throws EmptyNameException, EmptyDurationException, NegativeDurationException {
        Disk actual = new Disk("New Disk", diskFilter.filterByDuration(disk,
                new Duration(0, 5, 0), new Duration(0, 6, 0)));
        Disk expected = new Disk("New Disk");
        expected.addComposition(c1);
        expected.addComposition(c3);
        Assert.assertEquals(actual, expected);
    }
}

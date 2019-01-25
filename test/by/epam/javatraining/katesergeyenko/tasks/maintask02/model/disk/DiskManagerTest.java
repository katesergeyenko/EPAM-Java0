package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.Music;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.maininstrument.MainInstrument;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Song;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.style.Style;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class DiskManagerTest {
    Disk disk;
    Composition c1;
    Composition c2;
    Composition c3;
    Composition c4;
    Composition c5;
    List<Composition> listOfCompositions = new LinkedList<>();

    @BeforeMethod
    public void beforeClass() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        c1 = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 4, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        c2 = new Music("The Nutcracker's Adagio", "Tchaikovsky", 1892,
                0, 6, 16, MainInstrument.FLUTE);
        c3 = new Song("Kissing strangers", "DNCE", 2010,
                0, 5, 4, Style.POP,
                "...Open heart, open mind, never know who you'll find...");
        c4 = new Music("For Elise", "Beethoven", 1810,
                0, 3, 36, MainInstrument.PIANO);
        c5 = new Song("Love the way you lie", "Eminem feat. Rihanna", 2010,
                0, 4, 27, Style.RAP, "Some words that I don't know");

        disk = new Disk("The Best Songs", listOfCompositions);

        DiskManager.addComposition(disk, c1);
        DiskManager.addComposition(disk, c2);
        DiskManager.addComposition(disk, c3);
        DiskManager.addComposition(disk, c4);
        DiskManager.addComposition(disk, c5);
    }

    // test addComposition(Disk disk, Composition composition)
    @Test
    public void testAddComposition() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Music("Some name", "Some musician", 2000, 0, 3, 17, MainInstrument.VIOLIN);
        Assert.assertEquals(DiskManager.addComposition(disk, composition), true);
    }

    @Test
    public void testAddComposition2() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 4, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        Assert.assertEquals(DiskManager.addComposition(disk, composition), true);
    }

    // test removeComposition(Disk disk, Composition composition)
    @Test
    public void testRemoveComposition() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Music("Some name", "Some musician", 2000, 0, 3, 17, MainInstrument.VIOLIN);
        Assert.assertEquals(DiskManager.removeComposition(disk, composition), false);
    }

    @Test
    public void testRemoveComposition2() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 4, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        Assert.assertEquals(DiskManager.removeComposition(disk, composition), true);
    }
}

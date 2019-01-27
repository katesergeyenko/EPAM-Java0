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

public class DiskTest {
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
    }

    // test addComposition(Disk disk, Composition composition)
    @Test
    public void testAddComposition() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Music("Some name", "Some musician", 2000, 0, 3, 17, InstrumentType.VIOLIN);
        Assert.assertEquals(disk.addComposition(composition), true);
    }

    @Test
    public void testAddComposition2() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 4, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        Assert.assertEquals(disk.addComposition(composition), true);
    }

    // test removeComposition(Disk disk, Composition composition)
    @Test
    public void testRemoveComposition() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Music("Another name", "Another musician", 2000, 0, 3, 17, InstrumentType.VIOLIN);
         Assert.assertEquals(disk.removeComposition(composition), false);
    }

    @Test
    public void testRemoveComposition2() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException {
        Composition composition = new Song("Don't cry", "Guns'n'Roses", 1991,
                0, 5, 4, Style.ROCK,
                "...And  when you're in need of someone by I won't deny you...");
        Assert.assertEquals(disk.removeComposition(composition), true);
    }
}

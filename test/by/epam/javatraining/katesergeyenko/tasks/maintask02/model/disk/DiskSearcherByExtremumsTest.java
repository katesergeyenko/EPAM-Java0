package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.InstrumentType;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.Music;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Song;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Style;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class DiskSearcherByExtremumsTest {
    Disk disk;
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
                0, 5, 4, Style.ROCK,
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

    // test searchMinByName(Disk disk)
    @Test
    public void testSearchMinByName() {
        Composition expected = c1;
        Composition actual = DiskSeacherByExtremums.searchMinByName(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMaxByName(Disk disk)
    @Test
    public void testSearchMaxByName() {
        Composition expected = c2;
        Composition actual = DiskSeacherByExtremums.searchMaxByName(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMinByMusician(Disk disk)
    @Test
    public void testSearchMinByMusician() {
        Composition expected = c4;
        Composition actual = DiskSeacherByExtremums.searchMinByMusician(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMaxByMusician(Disk disk)
    @Test
    public void testSearchMaxByMusician() {
        Composition expected = c2;
        Composition actual = DiskSeacherByExtremums.searchMaxByMusician(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMinByYear(Disk disk)
    @Test
    public void testSearchMinByYear() {
        Composition expected = c4;
        Composition actual = DiskSeacherByExtremums.searchMinByYear(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMaxByYear(Disk disk)
    @Test
    public void testSearchMaxByYear() {
        Composition expected = c3;
        Composition actual = DiskSeacherByExtremums.searchMaxByYear(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMinByDuration(Disk disk)
    @Test
    public void testSearchMinByDuration() {
        Composition expected = c4;
        Composition actual = DiskSeacherByExtremums.searchMinByDuration(disk);
        Assert.assertEquals(actual, expected);
    }

    // test searchMaxByDuration(Disk disk)
    @Test
    public void testSearchMaxByDuration() {
        Composition expected = c2;
        Composition actual = DiskSeacherByExtremums.searchMaxByDuration(disk);
        Assert.assertEquals(actual, expected);
    }
}

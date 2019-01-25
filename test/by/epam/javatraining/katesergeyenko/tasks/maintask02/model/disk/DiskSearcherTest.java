package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.Music;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.maininstrument.MainInstrument;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.Song;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.style.Style;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class DiskSearcherTest {
    Disk disk;
    Composition c1;
    Composition c2;
    Composition c3;
    Composition c4;
    Composition c5;
    List<Composition> listOfCompositions = new LinkedList<>();
    DiskSearcher diskSearcher = new DiskSearcher();

    @BeforeClass
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

    // test indexOfComposition(Disk disk, Composition composition)
    @Test
    public void testIndexOfComposition()  throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException  {
        Composition composition = new Song("Kissing strangers", "DNCE", 2010,
                0, 5, 4, Style.POP,
                "...Open heart, open mind, never know who you'll find...");
        int expected = 2;
        int actual = diskSearcher.indexOfComposition(disk, composition);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIndexOfComposition1() throws EmptyMusicianException, NegativeDurationException,
            EmptyNameException, EmptyDurationException, NegativeYearException, EmptyYearException  {
        Composition composition = new Song("Kissing strangers", "DNCE", 2016,
                0, 5, 4, Style.POP,
                "...Open heart, open mind, never know who you'll find...");
        int expected = -1;
        int actual = diskSearcher.indexOfComposition(disk, composition);
        Assert.assertEquals(actual, expected);
    }

    // test searchCompositionByName(Disk disk, String name)
    @Test
    public void TestSearchCompositionByName() {
        List<Composition> actual = diskSearcher.searchCompositionByName(disk, "Don't cry");
        List<Composition> expected = new LinkedList<>();
        expected.add(c1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSearchCompositionByName2() {
        List<Composition> actual = diskSearcher.searchCompositionByName(disk, "November rain");
        List<Composition> expected = new LinkedList<>();
        Assert.assertEquals(actual, expected);
    }

    // test searchCompositionByMusician(Disk disk, String musician)
    @Test
    public void TestSearchCompositionByMusician() {
        List<Composition> actual = diskSearcher.searchCompositionByMusician(disk, "Tchaikovsky");
        List<Composition> expected = new LinkedList<>();
        expected.add(c2);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSearchCompositionByMusician2() {
        List<Composition> actual = diskSearcher.searchCompositionByMusician(disk, "Mozart");
        List<Composition> expected = new LinkedList<>();
        Assert.assertEquals(actual, expected);
    }

    // test searchCompositionByYear(Disk disk, int year)
    @Test
    public void TestSearchCompositionByYear() {
        List<Composition> actual = diskSearcher.searchCompositionByYear(disk, 2010);
        List<Composition> expected = new LinkedList<>();
        expected.add(c3);
        expected.add(c5);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSearchCompositionByYear2() {
        List<Composition> actual = diskSearcher.searchCompositionByYear(disk, 2016);
        List<Composition> expected = new LinkedList<>();
        Assert.assertEquals(actual, expected);
    }

    // test searchCompositionByDuration(Disk disk, Duration duration)
    @Test
    public void TestSearchCompositionByDuration() throws NegativeDurationException, EmptyDurationException{
        List<Composition> actual = diskSearcher.searchCompositionByDuration(disk, new Duration(0, 5, 4));
        List<Composition> expected = new LinkedList<>();
        expected.add(c1);
        expected.add(c3);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSearchCompositionByDuration2() throws NegativeDurationException, EmptyDurationException{
        List<Composition> actual = diskSearcher.searchCompositionByDuration(disk, new Duration(0, 10, 3));
        List<Composition> expected = new LinkedList<>();
        Assert.assertEquals(actual, expected);
    }
}

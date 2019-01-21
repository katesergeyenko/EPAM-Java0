package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.*;

import java.util.Collections;
import java.util.Comparator;

public class DiskSorter {
    public static void sortByName(Disk disk) {
        Collections.sort(disk.getCompositions(), new NameComparator());
    }

    public static void sortByMusician(Disk disk) {
        Collections.sort(disk.getCompositions(), new MusicianComparator());
    }

    public static void sortByYear(Disk disk) {
        Collections.sort(disk.getCompositions(), new YearComparator());
    }

    public static void sortByDuration(Disk disk) {
        Collections.sort(disk.getCompositions(), new DurationComparator());
    }
}
